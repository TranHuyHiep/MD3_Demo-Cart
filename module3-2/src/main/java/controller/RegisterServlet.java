package controller;

import dao.RegisterDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;
import java.time.LocalDate;
import java.util.regex.Pattern;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");

        if (username.equals("")){
            req.setAttribute("messusername", "không để trống");
        }

        String password = req.getParameter("password");
        if("".equals(password))
        {
            req.setAttribute("messpass","không để trống");
        }
//        Pattern pattern1 = Pattern.compile(" /^[A-Za-z0-9_\\.]{6,32}$/");
        Pattern pattern1 = Pattern.compile("[ -~]{6,32}");
        if (!pattern1.matcher(password).find()) {
            req.setAttribute("messpassword", "Tối thiểu ６ ký tự");
        }

        String confirmpassword = req.getParameter("confirmpass");
        if(!confirmpassword.equals(password))
        {
            req.setAttribute("messconfirm","xác nhận sai mật khẩu");
        }
        String email = req.getParameter("email");
        if(email.equals(""))
        {
            req.setAttribute("messemail","không để trống");
        }
        LocalDate birthday = null;
        try {
            birthday = LocalDate.parse(req.getParameter("birthday"));
        }catch (Exception e){
            e.printStackTrace();
        }
        String phonenumber = req.getParameter("phonenumber");

        Pattern pattern2 = Pattern.compile("^0{1}[1-9]{1}[0-9]{8}$");
        if(phonenumber.equals(""))
        {
            req.setAttribute("messphonenumber","không để trống");
        }
        if (!pattern2.matcher(phonenumber).find()) {
            req.setAttribute("messphonenumber", "10 chữ số, bắt đầu bằng số 0. Số tiếp theo không được là số 0");
        }

        boolean check = !username.equals("");
        boolean check1 = !password.equals("");
        boolean check2 = pattern1.matcher(password).find();
        boolean check3 = confirmpassword.equals(password);
        boolean check4 = !email.equals("");
        boolean check5 = !phonenumber.equals("");
        boolean check6 = pattern2.matcher(phonenumber).find();

        if (check&&check1&&check2&&check3&&check4&&check5&&check6) {
            Account account = new Account();
            account.setUsername(username);
            account.setPassword(password);
            account.setPhonenumber(phonenumber);
            account.setEmail(email);
            account.setBirthday(birthday);
            account.setStautus(true);
            account.setId_role(2);
            RegisterDao.save(account);
            resp.sendRedirect("/login");
        } else {
            req.setAttribute("mess1","Lỗi Rồi");
            RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
            dispatcher.forward(req,resp);

        }

    }
}
