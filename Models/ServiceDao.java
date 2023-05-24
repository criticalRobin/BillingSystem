package Models;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import Complements.Messages;
import Complements.ScannerReader;

public class ServiceDao {
    public static List<Service> services = new LinkedList<>();

    public static boolean registerService(String id, String name, double priceByUnit, double iva) {
        try {
            services.add(new Service(id, name, priceByUnit, iva));
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public static boolean updateServiceInfo(String id) {
        try {
            for (Service serv : services) {
                if (serv.getId().equals(id)) {
                    String option = ScannerReader.readUpdateProductServiceOption();
                    switch (option) {
                        case "1":
                            String newName = ScannerReader.readProductServiceName().toUpperCase(Locale.ENGLISH);
                            serv.setName(newName);
                            break;
                        case "2":
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

    public static boolean deleteService(String id) {
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

    public static void print() {
        System.out.println("Nombre/Precio/Iva/Id");
        for (Service ser : services) {
            System.out.println("[" + ser.getName() + " - " + ser.getPriceByUnit() + " - " + ser.getIva() + " - "
                    + ser.getId() + "]");
        }
    }
}
