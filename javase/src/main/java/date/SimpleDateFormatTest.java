package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期的显示格式
 * Created by conglin.liu on 2017/9/13.
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) {
        String s = "2017-09-13 17:51:20";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = simpleDateFormat.parse(s);
            System.out.println(simpleDateFormat.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
