package Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchStaffByID {
    public static void searchByID(ArrayList<Staff> listStaff) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên bạn muốn tìm kiếm");
        String keyword = sc.nextLine();
        ArrayList<Staff> matched = new ArrayList<>();
        for (int i = 0; i < listStaff.size(); i++) {

            if (listStaff.get(i).staffID.contains(keyword)) {
                matched.add(listStaff.get(i));
            }
        }

        if (matched == null || matched.isEmpty()) {
            System.out.println("Không có nhân viên này trong danh sách");
        } else {
            System.out.printf("Tìm thấy %d kết quả",matched.size());
            for (int i = 0; i < listStaff.size(); i++) {

                if (listStaff.get(i).staffID.contains(keyword)) {
                    listStaff.remove(listStaff.get(i));
                }
            }
            System.out.println("Danh sách nhân viên sau khi xóa");
            listStaff.forEach(System.out::println);
        }





    }
}
