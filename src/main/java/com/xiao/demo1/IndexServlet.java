package com.xiao.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/IndexServlet")

public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session=req.getSession();
        User user= (User) session.getAttribute("user");
        if (user==null){
            resp.getWriter().println("您还未登录，请先<a href='"+this.getServletContext().getContextPath()+"/login1.jsp'>登录</a>");
        }else{
            resp.getWriter().println("欢迎回来："+user.getUsername()+",<a href='"+this.getServletContext().getContextPath()+"/LogoutServlet'>退出</a>");
        }
    }
}
