package JavaBasic_Bai3;

public class IfElse {

    static int number = 100;

    //Cách 1: Khởi tạo hàm static
    public static int compareNumber(int n) {
        if (n == number) {
            System.out.println("n bằng 100");
        } else if (n < number) {
            System.out.println("n bé hơn 100");
        } else {
            System.out.println("n lớn hơn 100");
        }
        return n;
    }
    public static void main(String[] agrs) {
        IfElse.compareNumber(1000);
    }
}

//   //Cách 2: Khởi tạo hàm không phải static
//    public int compareNumber(int n) {
//        if (n == number) {
//            System.out.println("n bằng 100");
//        } else if (n < number) {
//            System.out.println("n bé hơn 100");
//        } else {
//            System.out.println("n lớn hơn 100");
//        }
//        return n;
//    }
//        public static void main(String[] args){
//            IfElse soSanh = new IfElse();
//            soSanh.compareNumber(99);
//        }
//    }


