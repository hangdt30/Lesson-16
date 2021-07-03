package Staff;

import java.util.ArrayList;
import java.util.List;

public class AddStaff {
    public static void addNewStaff(ArrayList listStaff){
        Staff staff1 = new Staff("VM1254","Nguyễn Mạnh Quỳnh","123 Phan Chu Trinh, Hoàn Kiếm, Hà Nội",42,"0987678890");
        listStaff.add(staff1);
        ArrayList addedList = new ArrayList<>(List.of(
                new Staff("VM1255","Thiều Bảo Trâm","23 Phan Bội Châu, Hoàn Kiếm, Hà Nội",34,"0987865432"),
                new Staff("VM1256","Sơn Tùng M-TP","Trần Khát Chân, Hai Bà Trưng, Hà Nội",26,"0923456678"),
                new Staff("VM1257","Hoàng Thùy Linh","Trần Xuân Soạn, Hai Bà Trưng, Hà Nội",30,"0987654567")
        ));
        listStaff.addAll(addedList);
        listStaff.forEach(System.out::println);
    }
}
