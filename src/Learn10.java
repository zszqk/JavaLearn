public class Learn10 {
    /**
     * 枚举类
     * @param args
     */
    public static void main(String[] args) {
        Color cr = Color.Blue;
        System.out.println(cr.toString());
    }
}
enum Color{
    Red("红"), Green("绿"), Blue("蓝");
    private final String chinese;
    private Color(String chinese){
        this.chinese = chinese;
    }
    @Override
    public String toString(){
        return this.chinese;
    }
}
