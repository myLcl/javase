package inicialize;

/**
 * 类加载 : 初始化子类 , 子类调用父类的静态变量
 *<p> 测试入口main()
 *
 * Created by conglin.liu on 2017/8/9.
 */
public class Parent {
    static final String s = "我是常量";
    static int i = 3;
    static {
        System.out.println("父类静态代码块 i="+ i);
    }

    public Parent() {
        System.out.println("in parent constructor");
    }

    public static void main(String[] args) {
        //子类调用父类的静态变量 , 子类不会初始化
//        System.out.println(Child.i);

        Child child = new Child();

    }

}

class Child extends Parent{
    static int i = 2;
    static {
        System.out.println("子类静态代码块i=" + i);
    }

    public Child() {
        System.out.println("in Child constructor");
    }
}
