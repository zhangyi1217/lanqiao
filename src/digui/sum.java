package digui;

public class sum {

    public static int sum(int []a, int n){
        if (n==0)return 0;
        else return a[n-1] + sum(a,n-1);
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(a,3));
    }
}


