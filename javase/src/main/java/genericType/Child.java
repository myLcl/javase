package genericType;

/**
 * 类型擦除与多态
 * Created by conglin.liu on 2017/8/31.
 */
public class Child extends GenericClass<String>{

        @Override
        public void setValue(String value) {
            super.setValue(value);
        }

        public static void main(String[] args) {
            Child child = new Child();
            child.setValue("1");

//        编译错误
//        child.setValue(new Object());
        }
}
