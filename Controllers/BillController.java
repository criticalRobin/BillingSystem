package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.Client;
import Models.ClientDao;
import Models.Product;
import Models.ProductDao;
import Models.Service;
import Models.ServiceDao;
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
        boolean result = false;
        do {
            String option = ScannerReader.readOptionFromToBuy();
            switch (option) {
                case "1":
                    System.out.println("Productos");
                    ProductDao.print();
                    String idP = ScannerReader.readProductServiceId();
                    result = false;
                    if (!Validations.validateIdentifier(idP))
                        return false;
                    for (Product pro : ProductDao.products) {
                        if (pro.getId().equals(idP)) {      
                            int quantity = Integer.parseInt(ScannerReader.readQuantity());
                            bill.addProduct(pro,quantity);
                            result = true;
                            break;
                        }
                    }
                    if (!result)
                        System.out.println("ese producto no existe");
                    break;
                case "2":
                    System.out.println("Servicios");
                    ServiceDao.print();
                    String idS = ScannerReader.readProductServiceId();
                    result = false;
                    if (!Validations.validateIdentifier(idS))
                        return false;
                    for (Service ser : ServiceDao.services) {
                        if (ser.getId().equals(idS)) {
                            bill.addService(ser);
                            result = true;
                            break;
                        }
                    }
                    if (!result)
                        System.out.println("ese servicio no existe");
                    break;
                default:
                    Messages.switchDefaultMessage();
                    break;
            }
        } while (Validations.continueAdd("al carrito"));
        return result;
    }

    public static boolean toBill(Bill bill) {
        if (bill.header() && bill.calculateTotal()) {
            return true;
        }
        return false;
    }


}
