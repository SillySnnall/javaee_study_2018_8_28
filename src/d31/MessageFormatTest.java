package d31;


import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName: MessageFormatTest
 * @Description: MessageFormat类测试
 * @author: 孤傲苍狼
 * @date: 2014-8-29 下午10:29:19
 *
 */
public class MessageFormatTest {

    public static void main(String[] args) {
        //模式字符串
        String pattern = "On {0}, a hurricance destroyed {1} houses and caused {2} of damage.";
        //实例化MessageFormat对象，并装载相应的模式字符串
        MessageFormat format = new MessageFormat(pattern, Locale.CHINA);
        Object arr[] = {new Date(), 99, 100000000};
        //格式化模式字符串，参数数组中指定占位符相应的替换对象
        String result = format.format(arr);
        System.out.println(result);


        //模式字符串
        String pattern1 = "At {0, time, short} on {0, date}, a destroyed {1} houses and caused {2, number, currency} of damage.";
        //实例化MessageFormat对象，并装载相应的模式字符串
        MessageFormat format1 = new MessageFormat(pattern1, Locale.US);
        Object arr1[] = {new Date(), 99, 100000000};
        //格式化模式字符串，参数数组中指定占位符相应的替换对象
        String result1 = format1.format(arr1);
        System.out.println(result1);
    }
}
