package Views;

import Complements.Messages;
import Complements.ScannerReader;
import Controllers.ClientController;

public class Menu {
    public static void principalMenu() {
        try {
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
                        System.out.println("Facturacion Pendiente");
                        break;
                    case "5":
                        System.out.println("Byeeee");
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (principalMenu != "5");
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void addMenu() {
        try {
            String preMenu;
            do {
                preMenu = ScannerReader.readOptionFromAddMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        ClientController.addClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        break;
                    case "3":
                        System.out.println("Servicios");
                        break;
                    case "4":
                        System.out.println("Byeeeee");
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (preMenu != "4");
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void updateMenu() {
        try {
            String preMenu;
            do {
                preMenu = ScannerReader.readOptionFromUpdateMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        ClientController.updateClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        break;
                    case "3":
                        System.out.println("Servicios");
                        break;
                    case "4":
                        System.out.println("Byeeeee");
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (preMenu != "4");
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }

    public static void deleteMenu() {
        try {
            String preMenu;
            do {
                preMenu = ScannerReader.readOptionFromDeleteMenu();
                switch (preMenu) {
                    case "1":
                        System.out.println("Clientes");
                        ClientController.delateClientController();
                        break;
                    case "2":
                        System.out.println("Productos");
                        break;
                    case "3":
                        System.out.println("Servicios");
                        break;
                    case "4":
                        System.out.println("Byeeeee");
                        break;
                    default:
                        System.out.println("No es una opción válida");
                        break;
                }
            } while (preMenu != "4");
        } catch (Exception e) {
            Messages.errorMessage();
        }
    }
}
