package Models;

import java.util.LinkedList;
import java.util.List;

import Complements.Messages;
import Complements.ScannerReader;

public class ServiceDao {
    List<Service> services = new LinkedList<>();

    public boolean registerService(String id, String name, double priceByUnit, double iva) {
        try {
            services.add(new Service(id, name, priceByUnit, iva));
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public boolean updateServiceInfo(String id) {
        try {
            for (Service serv : services) {
                if (serv.getId().equals(id)) {
                    int option = ScannerReader.readUpdateProductServiceOption();
                    switch (option) {
                        case 1:
                            String newName = ScannerReader.readProducServiceName();
                            serv.setName(newName);
                            break;
                        case 2:
                            String newPrice = ScannerReader.readProductServicePriceByUnit();
                            serv.setPriceByUnit(Double.parseDouble(newPrice));
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

    public boolean deleteService(String id) {
        try {
            for (Service serv : services) {
                if (serv.getId().equals(id)) {
                    services.remove(serv);
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }
}
