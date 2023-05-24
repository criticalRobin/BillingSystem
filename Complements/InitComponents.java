package Complements;

import Models.Client;
import Models.ClientDao;
import Models.Product;
import Models.ProductDao;
import Models.Service;
import Models.ServiceDao;

public class InitComponents {
    public static void initComponents() {
        Client cli1 = new Client("HENRY", "CORTEZ", "1805472386", "1",
                "mi casa", "0998366771", "hcortez@uta.edu.ec");
        Client cli2 = new Client("MATIAS", "TITE", "1850137918", "1",
                "mi casa", "0998366771", "hcortez@uta.edu.ec");
        Client cli3 = new Client("EDDER", "NARANJO", "1805465489001", "2",
                "su casa", "0998366772", "edder@uta.es");
        Product product = new Product("A000", "CAJA DE COLORES", 0.99, "gr", 0);
        Product product2 = new Product("B000", "CAJA DE ESFEROS", 0.99, "gr", 0);
        Product product3 = new Product("C000", "CARPETA GRANDE", 1.15, "gr", 12);
        Service service = new Service("A000", "AGUA POTABLE", 15.00, 12.0);
        Service service2 = new Service("B000", "INTERNET", 20.00, 12.0);
        ClientDao.clients.add(cli1);
        ClientDao.clients.add(cli2);
        ClientDao.clients.add(cli3);
        ProductDao.products.add(product);
        ProductDao.products.add(product2);
        ProductDao.products.add(product3);
        ServiceDao.services.add(service);
        ServiceDao.services.add(service2);
    }
}
