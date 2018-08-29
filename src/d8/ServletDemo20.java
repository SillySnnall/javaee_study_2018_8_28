package d8;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "d8.ServletDemo20", urlPatterns = "/demo20")
public class ServletDemo20 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1.调用sendRedirect方法实现请求重定向,
         * sendRedirect方法内部调用了
         * response.setHeader("Location", "/JavaWeb_HttpServletResponse_Study_20140615/index.jsp");
         * response.setStatus(HttpServletResponse.SC_FOUND);//设置302状态码，等同于response.setStatus(302);
         */
//        response.sendRedirect("/index.jsp");
        response.sendRedirect(request.getContextPath()+"/index.jsp");

        //2.使用response设置302状态码和设置location响应头实现重定向实现请求重定向
        //response.setHeader("Location", "/JavaWeb_HttpServletResponse_Study_20140615/index.jsp");
        //response.setStatus(HttpServletResponse.SC_FOUND);//设置302状态码，等同于response.setStatus(302);
    }

}
