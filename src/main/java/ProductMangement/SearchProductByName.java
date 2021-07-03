package ProductMangement;

import java.util.ArrayList;

public class SearchProductByName extends Product{

    public SearchProductByName(String code, String name, int quantity, double price) {
        super(code, name, quantity, price);
    }
    public static void searchArray(ArrayList<Product> listProduct) {
        String keyword = "An";
        int count = 0;
        ArrayList<Product> matchedArray = new ArrayList<>();
        for (Product i : listProduct) {
            if (i.name.contains(keyword)) {
                matchedArray.add(i);
                count++;
            }
        }
        if (matchedArray == null) {
            System.out.println("There is no result match with your keyword");
        } else {
            System.out.printf("There are %d result(s) matching: \n", count);
            matchedArray.forEach(System.out::println);
        }

    }

}
