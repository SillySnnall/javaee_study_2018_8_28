package d6;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

@WebServlet(name = "d6.ServletDemo11", urlPatterns = "/demo11")
public class ServletDemo11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // 项目javaee_study_war_exploded 为 / 目录

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * response.setContentType("text/html;charset=UTF-8");目的是控制浏览器用UTF-8进行解码；
         * 这样就不会出现中文乱码了
         */
        response.setHeader("content-type", "text/html;charset=UTF-8");

        readWebRootDirPropCfgFile(response);//读取WebRoot目录下的properties配置文件
        response.getWriter().println("<hr/>");

        readPropCfgFile(response);//读取src目录下的db.config包中的db3.properties配置文件
        response.getWriter().println("<hr/>");
    }

    /**
     * 读取src目录下的db.config包中的db3.properties配置文件
     *
     * @param response
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void readPropCfgFile(HttpServletResponse response)
            throws FileNotFoundException, IOException {
        //通过ServletContext获取web资源的绝对路径
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/res/db3.properties");
        InputStream in = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        response.getWriter().println("读取src目录下的db.config包中的db3.properties配置文件：");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}",
                        driver, url, username, password));
    }

    /**
     * 通过ServletContext对象读取WebRoot目录下的properties配置文件
     *
     * @param response
     * @throws IOException
     */
    private void readWebRootDirPropCfgFile(HttpServletResponse response)
            throws IOException {
        /**
         * 通过ServletContext对象读取WebRoot目录下的properties配置文件
         * “/”代表的是项目根目录
         */
        InputStream in = this.getServletContext().getResourceAsStream("/db2.properties");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        response.getWriter().println("读取WebRoot目录下的db2.properties配置文件：");
        response.getWriter().print(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}",
                        driver, url, username, password));
    }
}
