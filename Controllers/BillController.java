package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.Client;
import Models.ClientDao;
import Models.Product;
import Models.ProductDao;
import Views.Bill;

public class BillController {

    public static Client getclient() {
        boolean result = true;
        String id;
        do {
            id = ScannerReader.readID();
            if (Validations.validateID(id)) {
                result = true;
            } else if (Validations.validateRUC(id)) {
                result = true;
            } else {
                result = false;
            }
        } while (!result);
        for (Client client : ClientDao.clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        Messages.clientNotExist();
        return null;
    }

    public static boolean toBuy(Bill bill) {
        String option = ScannerReader.readOptionFromToBuy();
        switch (option) {
            case "1":
                System.out.println("Productos");
                ProductDao.print();
                String id = ScannerReader.readProductServiceId();
                if (!Validations.validateIdentifier(id))
                    return false;
                for (Product pro : ProductDao.products) {
                    if (pro.getId().equals(id)) {
                        pro.setQuantity(0);
                    }
                }
                break;
            case "2":
                break;
            default:
                break;
        }
        return true;
    }

}
