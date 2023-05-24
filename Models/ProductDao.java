package Models;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;

public class ProductDao {
    public static List<Product> products = new LinkedList<>();

    public static boolean registerProduct(String id, String name, double priceByUnit, String uMeasure, double iva) {
        try {
            if (contains(id)){
                Messages.errorId();
                return false;
            }
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
                    String option = ScannerReader.readUpdateProductServiceOption();
                    switch (option) {
                        case "1":
                            String newName = ScannerReader.readProductServiceName().toUpperCase(Locale.ENGLISH);
                            if (Validations.validateProductName(newName)) {
                                pro.setName(newName);
                                Messages.updateProductClient();
                            }
                            break;
                        case "2":
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
                    Messages.eliminateProduct();
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public static void print() {
        System.out.println("Nombre/Precio/Iva/Id");
        for (Product pro : products) {
            System.out.println("[" + pro.getName() + " - " + pro.getPriceByUnit() + " - " + pro.getIva() + " - "
                    + pro.getId() + "]");
        }
    }

    private static boolean contains(String id) {
        for (Product pro : products) {
            if (pro.getId().equals(id)) {
            return true;
            }
        }
        return false;
    }
}
