package Staff;

import ProductMangement.Product;

import java.util.ArrayList;
import java.util.List;

public class StaffList extends Staff {
    public StaffList(String staffID, String staffName, String staffAddress, int staffAge, String staffPhone) {
        super(staffID, staffName, staffAddress, staffAge, staffPhone);
    }

    public static ArrayList inputData(){
        ArrayList<Staff> listStaff = new ArrayList<>(List.of(
                new Staff("ST1234", "Trương Ngọc Ánh", "458 Minh Khai, Hai Bà Trưng, Hà Nội", 32,"0968780098"),
                new Staff("ST1235", "Diệp Lâm Anh", "43 Nguyễn Chí Thanh, Đống Đa, Hà Nội", 30,"0989765432"),
                new Staff("ST1236", "Phương Mỹ Chi", "Vinhomes Central Park, Nguyễn Đức Cảnh, quận Bình Thạnh, thành phố Hồ Chí Mình", 27,"0989765932"),
                new Staff("ST1237", "Hồ Quang Hiếu", "306 Vạn Phúc, Hà Đông, Hà Nội", 23,"0989065432"),
                new Staff("ST1238", "Lâm Vỹ Dạ", "45 Võ Chí Công, Liên Chiểu, Đà Nẵng", 25,"0989760432")

        ));
        return listStaff;
    }
}
