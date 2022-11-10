package controller;

import dao.ProductDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;

@WebServlet(urlPatterns = "/crudServlet")
public class CRUD_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        int id = 0;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                resp.sendRedirect("/createProduct.jsp");
                break;
            case "delete":
                id = Integer.parseInt(req.getParameter("id"));
                ProductDao.deleteProduct(id);
                resp.sendRedirect("/crudServlet");
                break;
            case "edit":
                id = Integer.parseInt(req.getParameter("id"));
                Product product = ProductDao.FindProductById(id);
                req.setAttribute("p",product);
                RequestDispatcher dispatcher1 = req.getRequestDispatcher("/editProduct.jsp");
                dispatcher1.forward(req,resp);
                break;
            default:
                req.setAttribute("product", ProductDao.getAll());
                RequestDispatcher dispatcher = req.getRequestDispatcher("/showProduct.jsp");
                dispatcher.forward(req, resp);

        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        int id = 0;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String img = req.getParameter("img");
                String name = req.getParameter("name");
                int amount = Integer.parseInt(req.getParameter("amount"));
                double price = Double.parseDouble(req.getParameter("price"));
                ProductDao.save(new Product(img, name, amount, price));
                resp.sendRedirect("/crudServlet");
                break;
            case "edit":
                id = Integer.parseInt(req.getParameter("id"));
                String img1 = req.getParameter("img");
                String name1 = req.getParameter("name");
                int amount1 = Integer.parseInt(req.getParameter("amount"));
                double price1 = Double.parseDouble(req.getParameter("price"));
                Product product = new Product(id,img1,name1,amount1,price1);
                ProductDao.UpdateProduct(product);
                resp.sendRedirect("/crudServlet");
                break;
        }
    }

}



