package Views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;
import Models.Client;
import Models.Product;
import Models.Service;

public class Bill {
    Queue<Product> products;
    Queue<Service> services;
    Client c;
    // LocalDate date;
    // LocalTime hour;
    int subtotal;
    int total;

    public Bill(Client client) {
        this.c = client;
        this.products = new LinkedList<>();
        this.services = new LinkedList<>();

    }

    public static void main(String[] args) {
        Bill b = new Bill(
                new Client("David", "Ayme", "1805271937", "2", "En tu corazón", "0998643300", "dayme1937@uta.ec"));
        b.header();
        b.calculateTotal();
    }
    public void printProducts(Product p, double total){
        System.out.printf("%-10s | %-20s | %-10s | %-10s\n\n", p.getQuantity(), p.getName(), p.getPriceByUnit(), total);
    }

    // metodo provisional de calcular precio
    public boolean calculateTotal() {
        double totalTemp = 0;
        double totalWithIVA = 0; 
        double totalWithoutIVA = 0;
        if (products.isEmpty() && services.isEmpty()) {
            //mensaje de que no hay productos ni servicios
            return false;
        }
        //para productos
        if(!products.isEmpty()){
           for (Product product : products) {
            if(product.getIva() == 12.0){
                totalTemp = (product.getQuantity()*product.getPriceByUnit())*((product.getIva()/100.0)+1);
                this.printProducts(product, totalTemp);
                totalWithIVA = totalWithIVA + totalTemp;
            }else{
                totalTemp = (product.getQuantity()*product.getPriceByUnit());
                this.printProducts(product, totalTemp);
                totalWithoutIVA = totalWithoutIVA + totalTemp;
            }
            totalTemp = 0;
            System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
            "----------", "----------\n");
           } 

        }

        if(ser)
        
        return true;

    }
    //ENCABEZADO DE LA FACTURA
    public void header() {

        if (this.c.getTypeId().equals("1")) {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\tCédula: %s\n" +
                    "Correo Electrónico: %s\t\tCelular: %s\n"
                    + "Dirección: %s\t\tFecha: %s\n\n", this.c.getLastnames() + " " + this.c.getNames(), this.c.getId(),
                    this.c.getEmail(),
                    this.c.getPhoneNumber(), this.c.getAddress(), LocalDate.now());

        } else {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\t\tRUC: %s\n" +
                    "Correo Electrónico: %s\tCelular: %s\n"
                    + "Dirección: %s\t\tFecha: %s\n\n", this.c.getLastnames() + " " + this.c.getNames(), this.c.getId(),
                    this.c.getEmail(),
                    this.c.getPhoneNumber(), this.c.getAddress(), LocalDate.now());

        }

    }

}
