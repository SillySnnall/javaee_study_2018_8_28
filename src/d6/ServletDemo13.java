package d6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

@WebServlet(name = "d6.ServletDemo13", urlPatterns = "/demo13")
public class ServletDemo13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = "abcddfwerwesfasfsadf";
        /**
         * 设置数据合理的缓存时间值，以避免浏览器频繁向服务器发送请求，提升服务器的性能
         * 这里是将数据的缓存时间设置为1天
         */
        response.setDateHeader("expires", System.currentTimeMillis() + 24 * 3600 * 1000);
        response.getOutputStream().write(data.getBytes());
    }

}
