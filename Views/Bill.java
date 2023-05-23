package Views;

import java.time.LocalDate;
import java.time.LocalTime;

import Models.Client;

public class Bill {
    LocalDate date;
    LocalTime hour;

    // metodo provisional
    public static void main(String[] args) {
        Bill b = new Bill();
        b.impression(new Client("Alex", "Ayme", "1805271937", 1, "En tu corazon", "0980912722", "dayme1983@"));
    }

    public void impression(Client c) {
        // impresion si tiene cedula
        if (c.getTypeId() == 1) {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\t\tCédula: %s\n" +
                    "Correo Electrónico: %s\t\tCelular: %s\n"
                    + "Dirección: %s\t\tFecha: %s\n", c.getLastnames() + " " + c.getNames(), c.getId(), c.getEmail(),
                    c.getPhoneNumber(), c.getAddress(), date.now());
            System.out.printf("%-10s | %-20s | %-10s | %-10s\n", "Cantidad", "Producto/Servicio", "Precio U.", "Total");
            // los productos
            System.out.println("un producto");
            System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
                    "----------", "----------\n");
            System.out.printf("\t\t\tsubtotal");

        }

    }

}
