package Complements;

import java.util.Scanner;

public class ScannerReader {
    private static final Scanner SC = new Scanner(System.in);

    // Aqui ejemplo de como uso el metodo del mensaje de pedir nombre y en esta
    // clase Scanner lee el nombre ingresado por teclado
    ////////////////////////////////////////////////////////////////////////
    // Clients
    public static int readUpdateClient() {
        Messages.updateClientOptions();
        return SC.nextInt();
    }

    public static int readTypeID() {
        Messages.requestTypeId();
        return SC.nextInt();
    }

    public static String readName() {
        Messages.requestName();
        return SC.nextLine();
    }

    public static String readID() {
        Messages.requestId();
        return SC.nextLine();
    }

    public static String readLastName() {
        Messages.requestSurname();
        return SC.nextLine();
    }

    public static String readEmail() {
        Messages.requestEmail();
        return SC.nextLine();
    }

    public static String readAddress() {
        Messages.requestAddress();
        return SC.nextLine();
    }

    public static String readPhoneNumber() {
        Messages.requestPhone();
        return SC.nextLine();
    }
    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    ////////// Products/Services
    public static int readUpdateProductServiceOption() {
        Messages.updateProductOptions();
        return SC.nextInt();
    }

    public static String readProductServiceId() {
        Messages.requestProductServiceId();
        return SC.nextLine();
    }

    public static String readProducServiceName() {
        Messages.requestProductServiceName();
        return SC.nextLine();
    }

    public static double readProductServicePriceByUnit() {
        Messages.requestProductServicePriceByUnit();
        return SC.nextDouble();
    }

    public static double readProductServiceIva() {
        Messages.requestProductServiceIva();
        return SC.nextDouble();
    }

    public static String readUmeasure() {
        Messages.requestProductUmeasure();
        return SC.nextLine();
    }
    ///////////////////////////////////

    public static String continueUpdate() {
        Messages.continueUpdate();
        return SC.nextLine();
    }

    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    ////////// Menu
    public static String readOptionFromMenu() {
        Messages.menuOptions();
        return SC.nextLine();
    }

    public static String readOptionFromAddMenu() {
        Messages.addMenu();
        return SC.nextLine();
    }

    public static String readOptionFromUpdateMenu() {
        Messages.updateMenu();
        return SC.nextLine();
    }

    public static String readOptionFromDeleteMenu() {
        Messages.deleteMenu();
        return SC.nextLine();
    }
}
