import java.lang.reflect.Method;

public class Learn14 {
    public static void main(String[] args) throws Exception {
        // String对象:
        String s = "Hello world";
        // 获取String substring(int)方法，参数为int:
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果:
        String r = (m.invoke(s, 6)).toString();
        // 打印调用结果:
        System.out.println(r);
    }
}
