package d12.buybook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "IndexServlet", urlPatterns = "/buybook/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //创建Session
        request.getSession();
        out.write("本网站有如下书：<br/>");
        Set<Map.Entry<String, Bookx>> set = DB.getAll().entrySet();
        for (Map.Entry<String, Bookx> me : set) {
            Bookx bookx = me.getValue();
            String url = request.getContextPath() + "/buybook/buy?id=" + bookx.getId();
            //response. encodeURL(java.lang.String url)用于对表单action和超链接的url地址进行重写
            url = response.encodeURL(url);//将超链接的url地址进行重写,当Cookie 被禁用，会在地址栏带上Session
            out.println(bookx.getName() + "   <a href='" + url + "'>购买</a><br/>");
        }
    }
}

/**
 * 42  * @author gacl
 * 43  * 模拟数据库
 * 44
 */
class DB {
    private static Map<String, Bookx> map = new LinkedHashMap<String, Bookx>();

    static {
        map.put("1", new Bookx("1", "javaweb开发"));
        map.put("2", new Bookx("2", "spring开发"));
        map.put("3", new Bookx("3", "hibernate开发"));
        map.put("4", new Bookx("4", "struts开发"));
        map.put("5", new Bookx("5", "ajax开发"));
    }

    public static Map<String, Bookx> getAll() {
        return map;
    }
}

class Bookx {

    private String id;
    private String name;

    public Bookx() {
        super();
    }

    public Bookx(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
