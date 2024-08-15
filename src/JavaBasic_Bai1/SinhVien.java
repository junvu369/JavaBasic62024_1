package JavaBasic_Bai1;

public class SinhVien {
    String studentName = "Vu Thi Kim Dung";
    static String university = "National Economics University";

    public static void main(String[] agrs) {
        double mathScore = 7.5;
        double englishScore = 7.5;
        double literatureScore = 7.5;

        System.out.println(mathScore);
        System.out.println(englishScore);
        System.out.println(literatureScore);

        SinhVien sinhVien = new SinhVien();
        System.out.println(sinhVien.studentName);

        System.out.println(university);

        //Ngoài cách khởi tạo lại class ở đây, thì biến static có thể gọi thẳng thông qua Tên class. tên biến để in ra ở hàm Main
        System.out.println(ThongTin.EMAIL);
        System.out.println(ThongTin.TEL_NO);
        System.out.println(ThongTin.TOTAL_SCORE);
    }
}


//Code của Nelson

//    public static String TRUONG = "Trường Phan Ngọc Hiển";
//    public static int SO_BAO_DANH = 1;
//    public String HO_VA_TEN = "Nguyễn Văn A";
//    public String NGAY_SINH = "01/01/1991";
//    public String GENDER = "Nam";
//
//    //Cách 1: Gọi hàm static
////    public static void getInfo() {
////        String Tinh_Thanh_Pho = "Cần Thơ";
////        String Quan = "Ninh Kiều";
////        System.out.println(Tinh_Thanh_Pho);
////    }
////
////    public static void main(String[] args) {
////        SinhVien.getInfo();
////    }
//    //Cách 2: Gọi hàm bình thường
//
//    public void getInfo() {
//        String Tinh_Thanh_Pho = "Cần Thơ";
//        String Quan = "Ninh Kiều";
//        System.out.println(Tinh_Thanh_Pho);
//    }
//        public static void main (String[]args){
//            SinhVien sv = new SinhVien();
//            sv.getInfo();
//        }
//    }
