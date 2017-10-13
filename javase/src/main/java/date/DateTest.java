package date;

import java.util.Date;

/**
 * Created by conglin.liu on 2017/9/13.
 */
public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.after(date));
        System.out.println(date.before(date));
    }
}
