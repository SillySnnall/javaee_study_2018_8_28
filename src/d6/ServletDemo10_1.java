package d6;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "d6.ServletDemo10_1", urlPatterns = "/demo10_1")
public class ServletDemo10_1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = "<h1><font color='red'>abcdefghjkl</font></h1>";
               response.getOutputStream().write(data.getBytes());
               ServletContext context = this.getServletContext();//获取ServletContext对象
               RequestDispatcher rd = context.getRequestDispatcher("/demo10_2");//获取请求转发对象(RequestDispatcher)
               rd.forward(request, response);//调用forward方法实现请求转发
    }
}