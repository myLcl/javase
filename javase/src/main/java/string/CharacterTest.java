package string;

import org.junit.Test;

/**
 * Created by conglin.liu on 2017/9/22.
 */
public class CharacterTest {

    /**
     * 是否是数字
     */
    @Test
    public void  isDigit() {
        char c = '1';
        System.out.println(Character.isDigit(c));
    }

    /**
     * 是否有字母
     */
    @Test
    public void isLetter() {
        char c = 'a';
        System.out.println(Character.isLetter(c));
    }


    /**
     * 是否有空格
     */
    @Test
    public void isWhitespace() {
        char c = ' ';
        System.out.println(Character.isWhitespace(c));
    }

}

