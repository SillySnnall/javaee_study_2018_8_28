package d5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "d5.ServletDemo05", urlPatterns = "/demo05")
public class ServletDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 设置content-disposition响应头，让浏览器下载文件
         */
        response.setHeader("content-disposition", "attachment;filename=fenx.jpg");
        InputStream in = this.getServletContext().getResourceAsStream("/img/fenx.jpg");
        byte buffer[] = new byte[1024];
        int len = 0;
        OutputStream out = response.getOutputStream();
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
    }
}
