package JavaBasic_Bai5;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {

    //Khai báo hàm có return kết quả
    private static ArrayList<String> addEmployee(String name, String age, String jobTitle, String address, String exp) {
        ArrayList<String> employeeInfo = new ArrayList<>();

        employeeInfo.add(name);
        employeeInfo.add(age);
        employeeInfo.add(jobTitle);
        employeeInfo.add(address);
        employeeInfo.add(exp);

        return employeeInfo;
    }

    //Khai báo hàm không cần trả về kết quả trả về
//    private static void addEmployee(String name, String age, String jobTitle, String address, String exp) {
//        ArrayList<String> employeeInfo = new ArrayList<>();
//
//        employeeInfo.add(name);
//        employeeInfo.add(age);
//        employeeInfo.add(jobTitle);
//        employeeInfo.add(address);
//        employeeInfo.add(exp);
//
//        System.out.println("");
//    }
//}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i); //Thêm bao nhiêu, hiểu được bấy nhiêu độ dài mảng
            }
        }
        System.out.println("");
        System.out.println("***********Duyệt mảng trong ArrayList*************");

        //Duyệt giá trị trong ArrayList
        for (int i : list) {
            System.out.print(i + "\t"); // "\t" nghĩa là tab
        }

        //Ngoài lề - khai báo value luôn ở phần khởi tạo ArrayList (ít dùng).
        System.out.println("\t");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Selenium", "Test Automation"));
        ArrayList<String> list1 = list2;
        System.out.println(list1);

        System.out.println();
        System.out.println("\n**********Thông tin nhân viên********");

        ArrayList<String> employee = addEmployee(
                "Vũ Thị Kim Dung",
                "33",
                "Manual Tester",
                "Hanoi",
                "3 years"
        );

//        System.out.println("Các phần tử của Set");
//        System.out.print("\t" + employeeInfo + "\n");

        //In thông tin nhân viên trong ArrayList
        System.out.println();
        for (String value : employee) {
            System.out.println(value);
        }
//        for (int i = 0; i < employee.size(); i++) {
//            System.out.println(employee.get(i)); //For cơ bản nên dùng để add data vào Arraylist
//        }
    }
}
