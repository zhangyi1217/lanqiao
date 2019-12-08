package digui;

public class fibonacci {
    public static int finonacci(int n){
        if (n<=1)return 1;
        else return finonacci(n-1)+finonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(finonacci(4));
    }


}
