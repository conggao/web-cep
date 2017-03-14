import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 2016/12/26.
 */
public class FileName {
    @Test
    public void getFileName(){
        String regEx = "(.+)(\\.)(.+)$";
        String file="Hydrangeas.jpg";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(file);
        if (!m.find()) {
            System.out.println("文件路径格式错误!");
            return;
        }
        System.out.println(m.group(1));
        System.out.println(m.group(2));

        System.out.println(m.group(3));
    }
}
