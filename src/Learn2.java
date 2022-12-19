public class Learn2 {
    public static void main(String[] args) {
        /**
         * ..求圆周率PI
         */
        double pi = 0;
        for (double i=1;i<=1000;i++) {
            // TODO
            if(i==1){
                pi = 4;
            }else {
                pi += 4*(i%2==0?-1/(i*2-1):1/(i*2-1));
            }

        }
        System.out.println(pi);
    }
}
