package Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchStaffByName {
    public static void searchByName(ArrayList<Staff> listStaff) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên nhân viên bạn muốn tìm kiếm");
        String keyword = sc.nextLine();
        ArrayList<Staff> matched = new ArrayList<>();
        for (int i = 0; i < listStaff.size(); i++) {

            if (listStaff.get(i).staffName.contains(keyword)) {
                matched.add(listStaff.get(i));
            }
        }

        if (matched == null || matched.isEmpty()) {
            System.out.println("Không có nhân viên này trong danh sách");
        } else {
            for (int i = 0; i < listStaff.size(); i++) {

                if (listStaff.get(i).staffName.contains(keyword)) {
                    System.out.println("Nhập giá trị mới cho tên");
                    listStaff.get(i).staffName= sc.nextLine();
                    listStaff.set(i, listStaff.get(i));
                }
            }
            System.out.println("Danh sách nhân viên sau khi cập nhật");
            listStaff.forEach(System.out::println);
        }
    }
}
