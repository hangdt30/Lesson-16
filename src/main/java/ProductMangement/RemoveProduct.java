package ProductMangement;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveProduct {
    public static void removeProductByIndex(ArrayList<Product> listProduct) {
        listProduct.remove(2);
        System.out.println("List sản phẩm sau khi xóa");
        listProduct.forEach(System.out::println);
    }

    public static void removeProductByName(ArrayList<Product> listProduct) {
        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()){
            var product= iterator.next();
            if (product.name.equals("Muối biển"))
                iterator.remove();
        }
        System.out.println("List sản phẩm sau khi xóa");
        listProduct.forEach(System.out::println);
    }

    public static void removeAllProduct(ArrayList<Product> listProduct) {
        listProduct.clear();
        System.out.println("List sản phẩm sau khi xóa");
        if (listProduct.isEmpty())  System.out.println("Không còn sản phẩm nào trong danh sách sau khi xóa");
        else listProduct.forEach(System.out::println);

    }

}
