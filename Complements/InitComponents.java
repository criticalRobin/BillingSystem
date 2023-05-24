package Complements;

import Models.Client;
import Models.Product;

public class InitComponents {
    public static void initComponents(){
        Client cli1 = new Client("HENRY", "CORTEZ", "1805472386", "1", 
        "mi casa", "0998366771", "hcortez@uta.edu.ec");
        Client cli2 = new Client("MATIAS", "TITE", "1805472386", "1", 
        "mi casa", "0998366771", "hcortez@uta.edu.ec");
        Client cli3 = new Client("EDDER", "NARANJO", "1805465489001", "2",
        "su casa", "0998366772", "edder@uta.es");
        Product product = new Product("A", "caja de Colores", 0.99, "gr", 0);
    }
}
