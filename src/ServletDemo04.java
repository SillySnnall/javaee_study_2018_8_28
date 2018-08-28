import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "ServletDemo04", urlPatterns = "/demo04")
public class ServletDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 设置refresh响应头，让浏览器每隔3秒定时刷新
         */
//         response.setHeader("refresh", "3");
        /**
         * 设置refresh响应头，让浏览器3秒后跳转到http://www.baidu.com
         */
        response.setHeader("refresh", "3;url='http://www.baidu.com'");
        response.getWriter().write("gacl");
    }
}
