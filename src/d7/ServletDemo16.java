package d7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet(name = "d7.ServletDemo16", urlPatterns = "/demo16")
public class ServletDemo16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        outputOneByOutputStream(response);//使用OutputStream输出1到客户端浏览器
    }

    /**
     * 使用OutputStream流输出数字1
     *
     * @param response
     * @throws IOException
     */
    public void outputOneByOutputStream(HttpServletResponse response) throws IOException {
        response.setHeader("content-type", "text/html;charset=UTF-8");
        OutputStream outputStream = response.getOutputStream();
        outputStream.write("使用OutputStream流输出数字1：".getBytes("UTF-8"));
//        outputStream.write(1);// 无法显示
        outputStream.write((1+"").getBytes());
    }
}
