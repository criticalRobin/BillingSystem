package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ServiceDao;

public class ServiceController {
    public static boolean addServiceControlled() {
        boolean result = true;
        String id;
        String name;
        double priceByUnit;
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
            name = ScannerReader.readProductServiceName();
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

        iva = selectIva();
        ServiceDao.registerService(id, name, priceByUnit, iva);
        Messages.productAdded();
        return result;
    }

    public static boolean updateServiceControlled() {
        String id = ScannerReader.readProductServiceId();
        if (Validations.validateIdentifier(id)) {
            ServiceDao.updateServiceInfo(id);
            return true;
        }
        return false;
    }

    public static boolean deleteServiceControlled() {
        String id = ScannerReader.readProductServiceId();
        if (Validations.validateIdentifier(id)) {
            ServiceDao.deleteService(id);
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
