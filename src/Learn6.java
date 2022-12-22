public class Learn6 {
    /**
     * 使用静态方法和静态字段统计实例创建的个数
     * @param args
     */
    public static void main(String[] args) {
        Persons p1 = new Persons();
        Persons p2 = new Persons();
        Persons p3 = new Persons();
        System.out.println(Persons.getCount());
    }
}
class Persons{
    public static int count = 0;
    public Persons(){
        count+=1;
    }
    public static int getCount(){
        return count;
    }
}
