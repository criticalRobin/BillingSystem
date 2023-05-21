package Complements;

import java.util.Scanner;

public class ScannerReader {
    private static final Scanner SC = new Scanner(System.in);

    // Aqui ejemplo de como uso el metodo del mensaje de pedir nombre y en esta
    // clase Scanner lee el nombre ingresado por teclado
    public static String readName() {
        Messages.requestName();
        return SC.nextLine();
    }

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
}
