package Controllers;

import java.util.Locale;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ProductDao;

public class ProductController {
    public static boolean addProductControlled() {
        boolean result = true;
        String id;
        String name;
        double priceByUnit = 01;
        String uMeasure;
        double iva;

        do {
            id = ScannerReader.readProductServiceId();
            if (!Validations.validateIdentifier(id)) {
                result = false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            name = ScannerReader.readProductServiceName();
            if (!Validations.validateProductName(name)) {
                result = false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            try {
                priceByUnit = Double.parseDouble(ScannerReader.readProductServicePriceByUnit());
                if (!Validations.validatePrice(String.valueOf(priceByUnit))) {
                    result = false;
                } else {
                    result = true;
                }
            } catch (Exception e) {
                Messages.invalidPrice();
                result = false;
            }

        } while (!result);

        uMeasure = selectUmeasure();

        iva = selectIva();

        ProductDao.registerProduct(id.toUpperCase(Locale.ENGLISH), name.toUpperCase(Locale.ENGLISH), priceByUnit,
                uMeasure, iva);
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
        String ivaOption;
        boolean result = true;
        do {
            ivaOption = ScannerReader.readIvaOption();
            switch (ivaOption) {
                case "1":
                    iva = 0.0;
                    result = true;
                    break;
                case "2":
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

    public static String selectUmeasure() {
        String uMeasure = "";
        String uMeasureOption;
        boolean result = true;
        do {
            uMeasureOption = ScannerReader.readProductUmeasureOption();
            switch (uMeasureOption) {
                case "1":
                    uMeasure = "Lt";
                    result = true;
                    break;
                case "2":
                    uMeasure = "Kg";
                    result = true;
                    break;
                case "3":
                    uMeasure = "Gr";
                    result = true;
                    break;
                case "4":
                    uMeasure = "Lb";
                    result = true;
                    break;
                default:
                    Messages.wrongUmeasure();
                    result = false;
                    break;
            }
        } while (!result);
        return uMeasure;
    }

}
