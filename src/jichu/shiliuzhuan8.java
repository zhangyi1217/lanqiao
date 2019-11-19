package jichu;

import java.util.Scanner;

public class shiliuzhuan8 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int []shulie = new int[n];
        for(int i = 0;i < n-1;i++){
            Scanner input2 = new Scanner(System.in);
            int number = input2.nextInt();
            shulie[i] = number;
        }


    }


}
