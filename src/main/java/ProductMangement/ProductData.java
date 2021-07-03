package ProductMangement;

import java.util.*;

public class ProductData extends Product {
    public ProductData(String code, String name, int quantity, double price) {
        super(code, name, quantity, price);
    }

    //Thêm sản phẩm vào danh sách cách 1
    public static ArrayList inputData1(){
        ArrayList<Product> listProduct = new ArrayList<>(List.of(
                new Product("VM1234", "Tương ớt Chinsu", 30, 10500),
                new Product("VM1235", "Dầu ăn Tường An", 35, 45300),
                new Product("VM1236", "Mì tôm Omachi", 100, 4500),
                new Product("VM1237", "Sữa chua Vinamilk", 80, 5300),
                new Product("VM1238", "Bim bim Oishi", 50, 12000),
                new Product("VM1239", "Hạt nêm Knorr", 40, 25000),
                new Product("VM1240", "Bột canh Hải Châu", 35, 3500),
                new Product("VM1241", "Muối biển", 55, 6000),
                new Product("VM1242", "Cà Chua Vineco", 32, 45600),
                new Product("VM1243", "Bánh gạo An An", 43, 23000)
        ));
        return listProduct;
    }


    //Thêm sản phẩm vào danh sách cách 2
    public static ArrayList inputData2() {
        ArrayList<Product> addProduct = new ArrayList<>();
        addProduct.add(new Product("VM1234", "Tương ớt Chinsu", 30, 10500));
        addProduct.add(new Product("VM1235", "Dầu ăn Tường An", 35, 45300));
        addProduct.add(new Product("VM1236", "Mì tôm Omachi", 100, 4500));
        addProduct.add(new Product("VM1237", "Sữa chua Vinamilk", 80, 5300));
        addProduct.add(new Product("VM1239", "Hạt nêm Knorr", 40, 25000));
        addProduct.add(new Product("VM1240", "Bột canh Hải Châu", 35, 3500));
        addProduct.add(new Product("VM1241", "Muối biển", 55, 6000));
        addProduct.add(new Product("VM1242", "Cà Chua Vineco", 32, 45600));
        addProduct.add(new Product("VM1243", "Bánh gạo An An", 43, 23000));
        return addProduct;
    }

}

