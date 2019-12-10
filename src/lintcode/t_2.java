package lintcode;

public class t_2 {
    public static long moweiling(int n){
        long number = 1,count = 0;
        for (int i = 1;i<=n;i++){
            number = number*i;
            while (number%10==0){
                number/=10;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(moweiling(105));
    }
}
