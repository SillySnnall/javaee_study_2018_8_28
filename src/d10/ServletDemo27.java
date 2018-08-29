package d10;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "d10.ServletDemo27", urlPatterns = "/demo27")
public class ServletDemo27 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 客户端是以UTF-8编码传输数据到服务器端的，所以需要设置服务器端以UTF-8的编码进行接收，否则对于中文数据就会产生乱码
         */
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        System.out.println("userName：" + userName);
        // 由于现在的浏览器基本都是utf-8的编码了，所以上面已经能解决 get和post 乱码问题
        /**
         *
         * 对于以get方式传输的数据，request即使设置了以指定的编码接收数据也是无效的，默认的还是使用ISO8859-1这个字符编码来接收数据
         */
        String name = request.getParameter("userName");//接收数据
        name = new String(name.getBytes("ISO8859-1"), "UTF-8");//获取request对象以ISO8859-1字符编码接收到的原始数据的字节数组，然后通过字节数组以指定的编码构建字符串，解决乱码问题
        System.out.println("name：" + name);
    }
}
