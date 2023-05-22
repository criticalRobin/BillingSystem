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

    public static int readTypeID(){
        Messages.requestTypeId();
        return SC.nextInt();
    }

    public static String readName() {
        Messages.requestName();
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
    ////////// Products
    public static int readUpdateProductOption() {
        Messages.updateProductOptions();
        return SC.nextInt();
    }

    public static String readProductName() {
        Messages.requestProductName();
        return SC.nextLine();
    }

    public static double readProductPriceByUnit() {
        Messages.requestProductPriceByUnit();
        return SC.nextDouble();
    }
    ///////////////////////////////////

    public static String continueUpdate() {
        Messages.continueUpdate();
        return SC.nextLine();
    }

    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    ////////// Menu
    public static int readOptionFromMenu() {
        Messages.menuOptions();
        return SC.nextInt();
    }

    public static int readOptionFromAddMenu() {
        Messages.addMenu();
        return SC.nextInt();
    }

    public static int readOptionFromUpdateMenu() {
        Messages.updateMenu();
        return SC.nextInt();
    }

    public static int readOptionFromDeleteMenu() {
        Messages.deleteMenu();
        return SC.nextInt();
    }
}
