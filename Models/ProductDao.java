package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;

public class ProductDao {
    List<Product> products = new LinkedList<>();

    public boolean registerProduct(String id, String name, double priceByUnit, String uMeasure, double iva) {
        try {
            products.add(new Product(id, name, priceByUnit, uMeasure, iva));
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public boolean updateProductInfo(String id) {
        try {
            for (Product pro : products) {
                if (pro.getId().equals(id)) {
                    int option = ScannerReader.readUpdateProductServiceOption();
                    switch (option) {
                        case 1:
                            String newName = ScannerReader.readProducServiceName();
                            pro.setName(newName);
                            break;
                        case 2:
                            double newPrice = ScannerReader.readProductServicePriceByUnit();
                            pro.setPriceByUnit(newPrice);
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

    public boolean deleteProduct(String id) {
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
}
