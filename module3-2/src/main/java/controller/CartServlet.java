package controller;

import com.mysql.cj.xdevapi.Session;
import dao.BillDao;
import dao.BillDetailDao;
import dao.ProductDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jdk.internal.net.http.common.Pair;
import model.*;
import service.CartService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("account");
        CartService cartService = new CartService();
        double tongTien = 0;
        for (int i = 0; i < cartService.carts.size(); i++) {
            tongTien += cartService.carts.get(i).getTotalPrice();
        }

        BillDao.save(new Bill(account.getId(), tongTien));
        int idBill = BillDao.findIdMax();

        for (int i = 0; i < cartService.carts.size(); i++) {
            BillDetail billDetail = new BillDetail(cartService.carts.get(i).getAmount(), cartService.carts.get(i).getId_product(), idBill);
            BillDetailDao.save(billDetail);
        }
        cartService.reset();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("productId"));
        int soLuong = Integer.parseInt(req.getParameter("number"));

        Product product = ProductDao.FindProductById(id);
        Cart cart = new Cart(id, soLuong, soLuong * product.getPrice());

//        HttpSession session = req.getSession();
//        ArrayList<Cart> gioHang = (ArrayList<Cart>) session.getAttribute("carts");
//        if(gioHang == null) {
//            gioHang = new ArrayList<>();
//        }
//        gioHang.add(cart);
//        session.setAttribute("carts", gioHang);

        CartService cartService = new CartService();
        cartService.add(cart);

        req.setAttribute("carts", cartService.carts);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Cart.jsp");
        dispatcher.forward(req, resp);
    }
}
