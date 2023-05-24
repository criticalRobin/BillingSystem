package Controllers;

import java.util.Locale;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ServiceDao;

public class ServiceController {
    public static boolean addServiceControlled() {
        boolean result = true;
        String id;
        String name;
        double priceByUnit =0;
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
                return false;
            } else {
                result = true;
            }
        } while (!result);

        do {
            try{
                priceByUnit = Double.parseDouble(ScannerReader.readProductServicePriceByUnit());
                if (!Validations.validatePrice(String.valueOf(priceByUnit))) {
                    result = false;
                } else {
    
                    result = true;
                }
                }catch (Exception e){
                    Messages.invalidPrice();
                    result = false;
                }
        } while (!result);

        iva = selectIva();
        ServiceDao.registerService(id.toUpperCase(Locale.ENGLISH), name.toUpperCase(Locale.ENGLISH), priceByUnit, iva);
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
}
