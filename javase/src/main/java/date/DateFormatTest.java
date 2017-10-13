package date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 格式化日期
 * Created by conglin.liu on 2017/9/13.
 */
public class DateFormatTest {

    public static void main(String[] args) {
        System.out.println(DateFormat.getDateInstance().format(new Date())); //2017-9-13
        System.out.println(DateFormat.getDateTimeInstance().format(new Date())); //2017-9-13 14:42:40
        System.out.println(DateFormat.getInstance().format(new Date()));//17-9-13 下午2:42
        System.out.println(DateFormat.getTimeInstance().format(new Date()));  //14:42:40

        System.out.println(DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh","CN") ).format(new Date())); //2017年9月13日
        System.out.println(DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN") ).format(new Date())); //2017年9月13日 下午02时59分38秒 CST
    }

}
