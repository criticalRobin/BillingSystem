package Views;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Controllers.BillController;
import Controllers.ClientController;
import Controllers.ProductController;
import Controllers.ServiceController;
import Models.Client;
import Models.ClientDao;
import Models.ProductDao;
import Models.ServiceDao;

public class Menu {

    public static void principalMenu() {
        try {
            boolean result = true;
            String principalMenu;
            do {
                principalMenu = ScannerReader.readOptionFromMenu();
                switch (principalMenu) {
                    case "1":
                        addMenu();
                        break;
                    case "2":
                        updateMenu();
                        break;
                    case "3":
                        deleteMenu();
                        break;
                    case "4":
                        if (ClientDao.clients.isEmpty()) {
                            System.out.println("No existe ningun cliente registrado");
                            break;
                        }
                        System.out.println("==============================");
                        System.out.println("Facturacion");

                        Messages.clientList();
                        Client cli = BillController.getclient();
                        if (cli == null) {
                            break;
                        }
                        Bill bill = new Bill(cli);
                        if (BillController.toBuy(bill)) {
                            BillController.toBill(bill);
                            ClientDao.clients.remove(cli);
                            bill = null;
                        } else
                            System.out.println("No se pudo completar la facturacion");
                        break;
                    case "5":
                        if (Validations.endProgram()) {
                            result = false;
                            System.out.println("==============================");
                            System.out.println("Byeeee");
                        }
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (result);
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void addMenu() {
        try {
            String preMenu;
            boolean result = true;
            do {
                preMenu = ScannerReader.readOptionFromAddMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        ClientController.addClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        ProductController.addProductControlled();
                        ProductDao.print();
                        break;
                    case "3":
                        System.out.println("Servicios");
                        ServiceController.addServiceControlled();
                        ServiceDao.print();
                        break;
                    case "4":
                        if (!Validations.continueAdd("")) {
                            result = false;
                            System.out.println("Byeeee");
                        }
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (result);
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void updateMenu() {
        try {
            String preMenu;
            boolean result = true;
            do {
                preMenu = ScannerReader.readOptionFromUpdateMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        if (ClientDao.clients.isEmpty()) {
                            Messages.emptyClients();
                            break;
                        } else {
                            Messages.clientList();
                            ClientController.updateClientController();
                            break;
                        }
                    case "2":
                        System.out.println("Productos");
                        if (ProductDao.products.isEmpty()) {
                            Messages.emptyProduct();
                            break;
                        } else {
                            ProductDao.print();
                            ProductController.updateProductControlled();
                            ProductDao.print();
                            break;
                        }
                    case "3":
                        System.out.println("Servicios");
                        if (ServiceDao.services.isEmpty()) {
                            Messages.emptyService();
                            break;
                        } else {
                            ServiceDao.print();
                            ServiceController.updateServiceControlled();
                            ServiceDao.print();
                            break;
                        }
                    case "4":
                        if (!Validations.continueUpdate("")) {
                            result = false;
                            System.out.println("Byeeee");
                        }
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (result);
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void deleteMenu() {
        try {
            String preMenu;
            boolean result = true;
            do {
                preMenu = ScannerReader.readOptionFromDeleteMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        if (ClientDao.clients.isEmpty()) {
                            Messages.emptyClients();
                            break;
                        } else {
                            Messages.clientList();
                            ClientController.delateClientController();
                            break;
                        }
                    case "2":
                        System.out.println("Productos");
                        if (ProductDao.products.isEmpty()) {
                            Messages.emptyProduct();
                            break;
                        } else {
                            ProductDao.print();
                            ProductController.deleteProductControlled();
                            ProductDao.print();
                            break;
                        }
                    case "3":
                        System.out.println("Servicios");
                        if (ServiceDao.services.isEmpty()) {
                            Messages.emptyService();
                            break;
                        } else {
                            ServiceDao.print();
                            ServiceController.deleteServiceControlled();
                            ServiceDao.print();
                            break;
                        }
                    case "4":
                        if (!Validations.continueDelete("")) {
                            result = false;
                            System.out.println("Byeeee");
                        }
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (result);
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }
}
