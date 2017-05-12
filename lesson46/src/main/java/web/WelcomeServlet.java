package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by java on 12.05.2017.
 */
public class WelcomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   /*     resp.getOutputStream().write("<h1>Hello World</h1>".getBytes());
*/
        req.getRequestDispatcher("login.jsp").forward(req,resp);// peredaem otvet klienty

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);// присілает введенніе данніе из полей

        String login=req.getParameter("login");
        String password=req.getParameter("password");

        PrintWriter writer=resp.getWriter();
        writer.println(String.format("Hello, %s! paasword lenght is: %d", login,password.length()));


        req.setAttribute("userName",login);
        req.setAttribute("balance","1000000$");
        req.getRequestDispatcher("userPage.jsp").forward(req,resp);
    }
}
//HttpServletResponse otvet otpravlayaem