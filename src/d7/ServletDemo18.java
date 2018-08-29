package d7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@WebServlet(name = "d7.ServletDemo18", urlPatterns = "/demo18")
public class ServletDemo18 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        downloadChineseFileByOutputStream(response);//下载中文文件
    }

    /**
     * 下载中文文件,中文文件下载时，文件名要经过URL编码，否则会出现文件名乱码
     *
     * @param response
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void downloadChineseFileByOutputStream(HttpServletResponse response)
            throws FileNotFoundException, IOException {
        String realPath = this.getServletContext().getRealPath("/img/云南地图.jpg");//获取要下载的文件的绝对路径
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);//获取要下载的文件名
        //设置content-disposition响应头控制浏览器以下载的形式打开文件，中文文件名要使用URLEncoder.encode方法进行编码，否则会出现文件名乱码
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        InputStream in = new FileInputStream(realPath);//获取文件输入流
        int len = 0;
        byte[] buffer = new byte[1024];
        OutputStream out = response.getOutputStream();
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);//将缓冲区的数据输出到客户端浏览器
        }
        in.close();
    }
}
