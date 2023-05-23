package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ProductDao;

public class ProductController {
    public static boolean addProductControlled() {
        boolean result = true;
        String id;
        String name;
        double priceByUnit;
        String uMeasure;
        double iva;

        do {
            id = ScannerReader.readProductServiceId();
            if (!Validations.validateIdentifier(id)) {
                Messages.wrongIDProduct();
                result = false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            name = ScannerReader.readProducServiceName();
            if (!Validations.validateProductName(name)) {
                Messages.wrongNameProduct();
                return false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            String price = ScannerReader.readProductServicePriceByUnit();
            if (!Validations.validatePrice(price)) {
                Messages.wrongPriceProduct();
                return false;
            } else {
                priceByUnit = Double.parseDouble(price);
                result = true;
            }
        } while (!result);

        do {
            uMeasure = ScannerReader.readUmeasure();
            if (!Validations.validateExtent(uMeasure)) {
                Messages.wrongExtent();
                return false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            String inputIva = ScannerReader.readProductServiceIva();
            if (!Validations.validateIVA(inputIva)) {
                Messages.wrongIVA();
                return false;
            } else {
                iva = Double.parseDouble(inputIva);
                result = true;
            }
        } while (!result);

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
        return false;
    }
}
