package rumen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class yuan {
    public static double area(int r){
        double area = r * r * Math.PI;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double a = area(n);
        DecimalFormat df=new DecimalFormat("#.0000000");
        System.out.println(df.format(a));
    }
}
