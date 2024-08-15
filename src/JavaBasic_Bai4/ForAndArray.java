package JavaBasic_Bai4;

public class ForAndArray {

    //Code thầy sửa

    public static void main(String[] agrs) {
        //Bước 1: Khởi tạo mảng
        int mangSoNguyen[] = new int[26];
        int index = 0; //Tạo biến chỉ mục trung gian

        //Bước 2: Gán giá trị vào mảng
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); //In từ vòng lặp FOR theo bài thầy
                mangSoNguyen[index] = i; //Gán số chẵn vào vị trí mảng tuần tự
                index++;//Tăng biến chỉ mục lên 1 đơn vị
            }
        }
        System.out.println(""); //Thêm vào để xuống dòng, ngăn cách với lệnh in phía trên

        //Bước 3: Duyệt mảng (in mảng ra màn hình)
        //Cách 1: In bằng for cải tiến
        for (int value : mangSoNguyen)
            System.out.println(value); //In dọc
//          System.out.print(value + " "); // In 1 dòng hàng ngang

//        //Cách 2: In bằng for cơ bản (không hay dùng - for cơ bản hay dùng để thêm data vào mảng)
//        for (int i = 0; i < mangSoNguyen.length; i++){
//            System.out.println(mangSoNguyen[i]); //In dọc
//            System.out.print(mangSoNguyen[i] + " "); // In 1 dòng hàng ngang
//        }
    }
}

//Code cũ bị sai

//        int arr[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50 };
//
//        for (int i : arr) {
//            System.out.print(" " + i);
//        }
//    }

