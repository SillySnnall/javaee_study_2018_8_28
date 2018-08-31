package d25;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author gacl
 * SimpleTagSupport类实现了SimpleTag接口，
 * SampleTagDemo4类继承SimpleTagSupport
 */
public class SimpleTagDemo4 extends SimpleTagSupport {

    /* 简单标签使用这个方法就可以完成所有的业务逻辑
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     * 重写doTag方法，控制标签余下的Jsp不执行
     */
    @Override
    public void doTag() throws JspException, IOException {
        //抛出一个SkipPageException异常就可以控制标签余下的Jsp不执行
        throw new SkipPageException();
    }
}
