package genericType;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by conglin.liu on 2017/8/31.
 */
public class GenericClass<T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    //泛型方法
    public static <K>K get00(K k) {
        System.out.println(k);
        return null;
    }

    //类型限定类和接口统一使用 extends
    public <T extends GenericClass & Comparable & Serializable> T get01(T t1) {
        System.out.println(t1.compareTo(t1));
        return null;
    }


    //类型擦除
    public static void erase() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        System.out.println(arrayList1.getClass() == arrayList2.getClass());

        try {
            arrayList1.getClass().getMethod("add", Object.class).invoke(arrayList1,1);

            for (int i=0;i<arrayList1.size();i++) {
                System.out.println(arrayList1.get(i));
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
//        GenericClass.<Integer>get00(1);

//        GenericClass<String> genericClass = new GenericClass<>();
//        genericClass.value = "1";

        erase();

    }
}



