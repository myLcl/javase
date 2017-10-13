package number;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by conglin.liu on 2017/9/27.
 */
public class RandomTest {

    /**
     * 随机生成int值
     */
    @Test
    public void intTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
    }

    /**
     * 生成不同的随机数
     * <P>
     * List 保存随机数
      Boolean[] 容量等于随机数数量
      每次随机产生一个数, Boolean[]作为下标
     */
    @Test
    public void differInt()  {
        // 生成 [0-n) 个不重复的随机数
        // list 用来保存这些随机数

        ArrayList<Integer> list = new ArrayList<>();
        Boolean[] bool = new Boolean[10];

        Random random = new Random();


        int num = 0;
        for (int i = 0; i <10 ; i++) {
            do {
                num = random.nextInt(10);
            }while (bool[num]);

            bool[num] = true;
            list.add(num);
        }

        for (Integer integer: list) {
            System.out.println(integer);
        }
    }
}
