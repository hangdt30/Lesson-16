import ProductMangement.*;
import Staff.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Product> listProduct = ProductData.inputData1();
//        SearchProductByName.searchArray(listProduct);
//        UpdateProduct.updateByIndex(listProduct);
//        RemoveProduct.removeProductByIndex(listProduct);
//        RemoveProduct.removeProductByName(listProduct);
//        RemoveProduct.removeAllProduct(listProduct);
        ArrayList<Staff> listStaff = StaffList.inputData();
//        AddStaff.addNewStaff(listStaff);
//        SearchStaffByName.searchByName(listStaff);
        SearchStaffByID.searchByID(listStaff);
    }

}
