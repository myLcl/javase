package number;

import org.junit.Test;

/**
 * 数学运算
 * Created by conglin.liu on 2017/9/26.
 */
public class MathTest {

    /**
     * 随机数
     */
    @Test
    public void  random() {
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*3));
    }
}
