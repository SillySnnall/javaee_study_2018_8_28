package d6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.MessageFormat;
import java.util.Properties;

@WebServlet(name = "d6.ServletDemo12", urlPatterns = "/demo12")
public class ServletDemo12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
 * response.setContentType("text/html;charset=UTF-8");目的是控制浏览器用UTF-8进行解码；
 * 这样就不会出现中文乱码了
 */
        response.setHeader("content-type", "text/html;charset=UTF-8");
        test1(response);
        response.getWriter().println("<hr/>");
        test2(response);
    }
    // classes 下为 / 目录

    // 一个150多M的文件，使用类加载器去读取这个大文件时会导致内存溢出：只能用servletContext去读取
    //         * java.lang.OutOfMemoryError: Java heap space

    /**
     * 读取类路径下的资源文件
     *
     * @param response
     * @throws IOException
     */
    private void test1(HttpServletResponse response) throws IOException {
        //获取到装载当前类的类装载器
        ClassLoader loader = ServletDemo12.class.getClassLoader();
        //用类装载器读取src目录下的db1.properties配置文件
        InputStream in = loader.getResourceAsStream("../../db2.properties");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        response.getWriter().println("用类装载器读取src目录下的db1.properties配置文件：");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}",
                        driver, url, username, password));
    }

    /**
     * 读取类路径下面、包下面的资源文件
     *
     * @param response
     * @throws IOException
     */
    private void test2(HttpServletResponse response) throws IOException {
        //获取到装载当前类的类装载器
        ClassLoader loader = ServletDemo12.class.getClassLoader();
        //用类装载器读取src目录下的gacl.servlet.study包中的db4.properties配置文件
        InputStream in = loader.getResourceAsStream("/res/db3.properties");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        response.getWriter().println("用类装载器读取src目录下的gacl.servlet.study包中的db4.properties配置文件：");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}",
                        driver, url, username, password));
    }

}
