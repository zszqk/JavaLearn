public class Learn5{
    /**
     * 继承，接口，抽象类的使用
     * @param args
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.run();
        s1.getName();
    }
}
abstract class People{
    public String name;
    public abstract void getName();
}
interface Person {
    void run();
}
class Student extends People implements Person {
    private int age = 18;
    private String name = "小明";
    @Override
    public void run() {
        System.out.println("学生说话");
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }
}