import java.util.Scanner;

public class Learn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1石头，2剪刀3布中的任意一个数字");
        int player = sc.nextInt();
        switch (player){
            case 1-> System.out.println("你出的石头");
            case 2-> System.out.println("你出的剪刀");
            default -> System.out.println("你出的布");
        }
        int cp = (int)(Math.random()*3+1);
        switch (cp){
            case 1-> System.out.println("电脑出的石头");
            case 2-> System.out.println("电脑出的剪刀");
            default -> System.out.println("电脑出的布");
        }
        switch (cp - player){
            case 0 : System.out.println("平局");break;
            case -2:
            case 1:
                System.out.println("你赢了");break;
            case -1:
            case 2:
                System.out.println("你输了");break;
            default:
                System.out.println("不能打破规则嗷！");
        }

    }
}
