package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;

public class ProductDao {
    static List<Product> products = new LinkedList<>();

    public static boolean registerProduct(String id, String name, double priceByUnit, String uMeasure, double iva) {
        try {
            products.add(new Product(id, name, priceByUnit, uMeasure, iva));
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
        }
        return false;
    }

    public static boolean updateProductInfo(String id) {
        try {
            for (Product pro : products) {
                if (pro.getId().equals(id)) {
                    int option = ScannerReader.readUpdateProductServiceOption();
                    switch (option) {
                        case 1:
                            String newName = ScannerReader.readProducServiceName();
                            if (Validations.validateProductName(newName)) {
                                pro.setName(newName);
                                Messages.updateProductClient();
                            }
                            break;
                        case 2:
                            String newPrice = ScannerReader.readProductServicePriceByUnit();
                            if (Validations.validatePrice(newPrice)) {
                                pro.setPriceByUnit(Double.parseDouble(newPrice));
                                Messages.updateProductClient();
                            }
                            break;
                        default:
                            Messages.switchDefaultMessage();
                            break;
                    }
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public static boolean deleteProduct(String id) {
        try {
            for (Product pro : products) {
                if (pro.getId().equals(id)) {
                    products.remove(pro);
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public static void print() {
        for (Product pro : products) {
            System.out.println("[" + pro.getName() + " - " + pro.getId() + "]");
        }
    }
}
