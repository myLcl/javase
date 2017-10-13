package string;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则
 * Created by conglin.liu on 2017/10/12.
 */
public class regular {
    public static void main(String[] args) {
        //要验证的字符串
        String str = "a";
        //规则
        String regEx = "[a]";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        boolean res = matcher.matches();
        System.out.println(res);

    }
}
