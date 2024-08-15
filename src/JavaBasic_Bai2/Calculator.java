package JavaBasic_Bai2;

public class Calculator {

    // Đề bài là khai báo hàm mà mình khai báo biến là hiểu sai đề bài
//    int a = 10;
//    int b = 80;
//    int s = a + b;
//
//    double c = 9.7;
//    double d = 7.9;
//    double x = c * d;

    //Thầy chữa

    public int tong2soNguyen(int a , int b){
        return a + b;
    }

    public double tich2SoThuc(double a , double b){
        return a * b;
    }

    public static void main(String[] agrs) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.tong2soNguyen(5, 10));
        System.out.println(calculator.tich2SoThuc(5.5 , 9.0));
    }
}
