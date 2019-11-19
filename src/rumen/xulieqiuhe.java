package rumen;


import java.util.Scanner;

public class xulieqiuhe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long he = n+n*(n-1)/2;
        System.out.println(he);
    }
}
