package com.xiao.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取从login.jsp页面传递过来的用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 判断用户名和密码是否正确
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // 如果正确，设置共享参数username
            ServletContext context = getServletContext();
            context.setAttribute("username", username);

            // 获取RequestDispatcher对象并转发请求到WelcomeServlet
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WelcomeServlet");
            dispatcher.forward(request, response);
        } else {
            // 如果不正确，重定向到login.jsp页面
            response.sendRedirect("login1.jsp?error=true");
        }
    }
}
