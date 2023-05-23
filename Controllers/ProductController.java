package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ProductDao;

public class ProductController {
    public static boolean addProductControlled() {
        boolean result = false;
        String id;
        String name;
        double priceByUnit;
        String uMeasure;
        double iva;

        do {
            id = ScannerReader.readProductServiceId();
            if (!Validations.validateIdentifier(id)) {
                Messages.wrongIDProduct();
            } else {
                result = true;
            }
        } while (result);

        do {
            name = ScannerReader.readProducServiceName();
            if (!Validations.validateProductName(name)) {
                Messages.wrongNameProduct();
            } else {
                result = true;
            }
        } while (result);

        do {
            priceByUnit = ScannerReader.readProductServicePriceByUnit();
            if (!Validations.validatePrice(Double.toString(priceByUnit))) {
                Messages.wrongPriceProduct();
            } else {
                result = true;
            }
        } while (result);

        do {
            uMeasure = ScannerReader.readUmeasure();
            result = true;
        } while (result);

        do {
            iva = ScannerReader.readProductServiceIva();
            if (!Validations.validateIVA(Double.toString(iva))) {
                Messages.wrongIVA();
            } else {
                result = true;
            }
        } while (result);

        ProductDao.registerProduct(id, name, priceByUnit, uMeasure, iva);
        Messages.productAdded();
        return result;
    }

    public static boolean updateProductControlled() {
        String id = ScannerReader.readProductServiceId();
        if (Validations.validateIdentifier(id)) {
            ProductDao.updateProductInfo(id);
            return true;
        }
        // esto puse solo para guardar
        return true;
    }
}
