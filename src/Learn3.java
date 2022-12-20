import java.util.Arrays;
public class Learn3 {
    public static void main(String[] args) {
        /**
         * 对数组排序会直接修改数组本身。
         * n个数进行冒泡排序,第一轮比较n-1次，每一轮比较大的数都会移动到最后，因此每轮比较次数都会少1
         * 使用sort降序排序，可以先将数组sort之后(此时是升序),再将数组每个元素变成相反数再进行sort，然后再变成相反数(此时即为降序)
         */
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前
        System.out.println("排序前:"+Arrays.toString(ns));
        System.out.println("排序前数组地址"+ns);
        // 冒泡排序
        for(int i=0;i<ns.length-1;i++){//注意此处的i<ns.length-1
            for(int j=0;j<ns.length-i-1;j++){
                if(ns[j]>ns[j+1]){
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        // 排序后
        System.out.println("排序后:"+Arrays.toString(ns));
        System.out.println("排序后数组地址"+ns);
        // 使用标准库sort进行排序不会改变地址
        System.out.println("使用标准库sort进行排序不会改变地址");
        int []ms = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println("sort排序前地址:"+ms+"---"+Arrays.toString(ms));
        Arrays.sort(ms);
        System.out.println("sort排序后地址:"+ms+"---"+Arrays.toString(ms));
    }
}
