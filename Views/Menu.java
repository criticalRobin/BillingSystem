package Views;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Controllers.ClientController;
import Controllers.ProductController;
import Controllers.ServiceController;
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
                        System.out.println("==============================");
                        System.out.println("Facturacion Pendiente");
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
                        Messages.clientList();
                        ClientController.updateClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        ProductDao.print();
                        ProductController.updateProductControlled();
                        ProductDao.print();
                        break;
                    case "3":
                        System.out.println("Servicios");
                        ServiceDao.print();
                        ServiceController.updateServiceControlled();
                        ServiceDao.print();
                        break;
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
                        ClientController.delateClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        ProductDao.print();
                        ProductController.deleteProductControlled();
                        ProductDao.print();
                        break;
                    case "3":
                        System.out.println("Servicios");
                        ServiceDao.print();
                        ServiceController.deleteServiceControlled();
                        ServiceDao.print();
                        break;
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
