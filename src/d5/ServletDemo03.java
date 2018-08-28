package d5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "d5.ServletDemo03", urlPatterns = "/demo03")
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 浏览器能接收(Accept)的数据类型有:
         * application/x-ms-application,
         * image/jpeg,
         * application/xaml+xml,
         * image/gif,
         * image/pjpeg,
         * application/x-ms-xbap,
         * application/vnd.ms-excel,
         * application/vnd.ms-powerpoint,
         * application/msword,
         */
        response.setHeader("content-type", "image/jpeg");//使用content-type响应头指定发送给浏览器的数据类型为"image/jpeg"
        //读取位于项目根目录下的img文件夹里面的WP_20131005_002.jpg这张图片，返回一个输入流
        InputStream in = this.getServletContext().getResourceAsStream("/img/fenx.jpg");// 这个目录是在idea中的web/img/fenx.jpg中
        byte buffer[] = new byte[1024];
        int len = 0;
        OutputStream out = response.getOutputStream();//得到输出流
        while ((len = in.read(buffer)) > 0) {//读取输入流(in)里面的内容存储到缓冲区(buffer)
            out.write(buffer, 0, len);//将缓冲区里面的内容输出到浏览器
        }
    }
}
