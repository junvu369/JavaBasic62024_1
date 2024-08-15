package JavaBasic_Bai3;

public class OnTapToanTu {

    public static void main(String[] agrs){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 10;

        System.out.println((a < b) && (b < c));
        System.out.println((a < b) || (a == e));
        System.out.println((a < b) && (b < c) && (d < e));
        System.out.println((a < b) && (b < c) && (d < e) && (e < a));
        System.out.println((a < b) || (b < c) || (d < e) || (e < a));
        System.out.println((a < b) && (b < c) && (d > e) && (e == a));
    }
}
