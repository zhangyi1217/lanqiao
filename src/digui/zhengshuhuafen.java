package digui;

import java.util.Scanner;

public class zhengshuhuafen {
    public static int q(int n,int m){
        if (n<1||m<1)return 0;
        if ((n==1)||(m==1))return 1;
        if ((n<m))return q(n,n);
        if (n==m)return q(n,m-1)+1;
        return q(n,m-1)+q(n-m,m);
    }

    public static int p(int n){
        return q(n,n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(p(a));
    }
}
