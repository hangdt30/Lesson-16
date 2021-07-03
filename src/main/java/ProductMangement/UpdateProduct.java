package ProductMangement;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateProduct extends Product{

    public UpdateProduct(String code, String name, int quantity, double price) {
        super(code, name, quantity, price);
    }
    public static void updateByIndex(ArrayList<Product> listProduct) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số của phần tử bạn muốn cập nhật");
        int i =  Integer.parseInt(sc.nextLine());
        while (i < 0 && i >= listProduct.size()) {
            System.out.println("Bạn đã nhập sai giá trị, xin mời nhập lại");
            i = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Sản phẩm trước khi update");
        System.out.println(listProduct.get(i));
        System.out.println("Nhập giá trị mới cho tên sản phẩm");
        listProduct.get(i).name =sc.nextLine();
        listProduct.set(i,listProduct.get(i));
        System.out.println("Sản phẩm sau khi update");
        System.out.println(listProduct.get(i));
        System.out.println("Danh sách sản phẩm sau khi update");
        listProduct.forEach(System.out::println);
    }
}
