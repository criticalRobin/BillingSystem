package Complements;

import java.util.Scanner;

public class ScannerReader {
    private static final Scanner SC = new Scanner(System.in);

    // Aqui ejemplo de como uso el metodo del mensaje de pedir nombre y en esta
    // clase Scanner lee el nombre ingresado por teclado
    ////////////////////////////////////////////////////////////////////////
    // Clients
    public static String readUpdateClient() {
        Messages.updateClientOptions();
        return removeSpaces(SC.nextLine());
    }

    public static String readTypeID() {
        Messages.requestTypeId();
        return removeSpaces(SC.nextLine());
    }

    public static String readName() {
        Messages.requestName();
        return removeSpaces(SC.nextLine());
    }

    public static String readID() {
        Messages.requestId();
        return removeSpaces(SC.nextLine());
    }

    public static String readLastName() {
        Messages.requestSurname();
        return removeSpaces(SC.nextLine());
    }

    public static String readEmail() {
        Messages.requestEmail();
        return removeSpaces(SC.nextLine());
    }

    public static String readAddress() {
        Messages.requestAddress();
        return removeSpaces(SC.nextLine());
    }

    public static String readPhoneNumber() {
        Messages.requestPhone();
        return removeSpaces(SC.nextLine());
    }
    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    ////////// Products/Services
    public static String readUpdateProductServiceOption() {
        Messages.updateProductOptions();
        return SC.nextLine();
    }

    public static String readProductServiceId() {
        Messages.requestProductServiceId();
        return removeSpaces(SC.nextLine());
    }

    public static String readProductServiceName() {
        Messages.requestProductServiceName();
        return removeSpaces(SC.nextLine());
    }

    public static String readProductServicePriceByUnit() {
        Messages.requestProductServicePriceByUnit();
        return SC.nextLine();
    }

    public static String readProductServiceIva() {
        Messages.requestProductServiceIva();
        return SC.nextLine();
    }

    public static String readUmeasure() {
        Messages.requestProductUmeasure();
        return removeSpaces(SC.nextLine());
    }

    public static int readIvaOption() {
        Messages.requestIvaOption();
        return SC.nextInt();
    }

    public static String readQuantity(){
        Messages.requestProductQuantity();
        return SC.nextLine();
    }
    ///////////////////////////////////

    public static String continueUpdate(String data) {
        Messages.continueUpdate(data);
        return removeSpaces(SC.nextLine());
    }

    public static String continueAdd(String data) {
        Messages.continueAdd(data);
        return removeSpaces(SC.nextLine());
    }

    public static String continueDelete(String data) {
        Messages.continueDelete(data);
        return removeSpaces(SC.nextLine());
    }

    public static String endProgram() {
        Messages.endProgram();
        return removeSpaces(SC.nextLine());
    }

    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    ////////// Menu
    public static String readOptionFromMenu() {
        Messages.menuOptions();
        return removeSpaces(SC.nextLine());
    }

    public static String readOptionFromAddMenu() {
        Messages.addMenu();
        return removeSpaces(SC.nextLine());
    }

    public static String readOptionFromUpdateMenu() {
        Messages.updateMenu();
        return removeSpaces(SC.nextLine());
    }

    public static String readOptionFromDeleteMenu() {
        Messages.deleteMenu();
        return removeSpaces(SC.nextLine());
    }

    public static String readOptionFromToBuy(){
        Messages.shopMenu();
        return removeSpaces(SC.nextLine());
    }

    public static String removeSpaces(String input) {
        return input.trim();
    }
}
