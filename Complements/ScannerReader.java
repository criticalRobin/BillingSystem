package Complements;

import java.util.Scanner;

public class ScannerReader {
    private static final Scanner SC = new Scanner(System.in);

    // Aqui ejemplo de como uso el metodo del mensaje de pedir nombre y en esta
    // clase Scanner lee el nombre ingresado por teclado
    ////////////////////////////////////////////////////////////////////////
    //Clients
    public static int readUpdateClient(){
        Messages.updateClientOptions();
        return SC.nextInt();
    }
    
    public static String readName() {
        Messages.requestName();
        return SC.nextLine();
    }

    public static String readLastName(){
        Messages.requestSurname();
        return SC.nextLine();
    }

    public static String readEmail(){
        Messages.requestEmail();
        return SC.nextLine();
    }

    public static String readAddress(){
        Messages.requestAddress();
        return SC.nextLine();
    }

    public static String readPhoneNumber(){
        Messages.requestPhone();
        return SC.nextLine();
    }
    //////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////
    //////////Products
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
    
}
