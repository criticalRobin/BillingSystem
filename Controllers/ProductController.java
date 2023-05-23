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
        iva = selectIva();
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

    public static boolean deleteProductControlled() {
        String id = ScannerReader.readProductServiceId();
        if (Validations.validateIdentifier(id)) {
            ProductDao.deleteProduct(id);
        }
        return false;
    }

    public static double selectIva() {
        double iva = 0;
        int ivaOption;
        boolean result = true;
        do {
            ivaOption = ScannerReader.readIvaOption();
            switch (ivaOption) {
                case 1:
                    iva = 0.0;
                    result = true;
                    break;
                case 2:
                    iva = 12.0;
                    result = true;
                    break;
                default:
                    Messages.wrongIVA();
                    result = false;
                    break;
            }
        } while (!result);
        return iva;
    }

}
