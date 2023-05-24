package Views;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import Models.Client;
import Models.Product;
import Models.Service;

public class Bill {
    Queue<Product> products;
    Queue<Service> services;
    Client c;
    int subtotal;
    int total;

    public Bill(Client client) {
        this.c = client;
        this.products = new LinkedList<>();
        this.services = new LinkedList<>();
    }

    public static void main(String[] args) {
        Bill b = new Bill(
                new Client("David", "Ayme", "1805271937", "1", "En tu corazón", "0998643300", "dayme1937@uta.ec"));
        b.header();
        b.calculateTotal();
    }

    public void printProducts(Product p, double total) {
        System.out.printf("%-10d | %-20s | %-10.2f | %-10.2f\n\n", p.getQuantity(), p.getName(), p.getPriceByUnit(),
                total);
    }

    public void printServices(Service s, double total) {
        System.out.printf("%-10s | %-20s | %-10.2f | %-10.2f\n\n", s.getId(), s.getName(), s.getPriceByUnit(), total);
    }

    // metodo provisional de calcular precio
    public boolean calculateTotal() {
        double totalTemp = 0; // almaccena el total de un producto
        double subtotal = 0; // es el precio del producto sin impuestos
        double totalWithoutIVA = 0; // es el subtotal sin iva de todo
        double totalSubtotal = 0; // es el subtotal con iva de todo
        double ivaTotal = 0; // suma de solo el iva
        double totalBill = 0; // suma de todos los productos

        if (products.isEmpty() && services.isEmpty()) {
            // mensaje de que no hay productos ni servicios
            return false;
        }
        // para productos
        if (!products.isEmpty()) {
            System.out.printf("Productos:\n%-10s | %-20s | %-10s | %-10s\n\n", "Cantidad", "Producto", "Precio U.",
                    "Total");
            for (Product product : products) {
                if (product.getIva() != 0.0) {
                    subtotal = (product.getQuantity() * product.getPriceByUnit()); // precio sin impuesto
                    totalSubtotal = totalSubtotal + subtotal; // suma de subtotales

                    totalTemp = subtotal * ((product.getIva() / 100.0) + 1); // precio con impuesto
                    this.printProducts(product, totalTemp);

                    ivaTotal = ivaTotal + (totalTemp - subtotal); // suma de solo IVAS
                    totalBill = totalBill + totalTemp;

                } else {
                    totalTemp = (product.getQuantity() * product.getPriceByUnit());
                    this.printProducts(product, totalTemp);

                    totalWithoutIVA = totalWithoutIVA + totalTemp; // subtotal de 0
                    totalBill = totalBill + totalWithoutIVA;
                }
                totalTemp = 0;
                System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
                        "----------", "----------\n");
            }

        }
        if (!services.isEmpty()) {
            for (Service service : services) {
                System.out.printf("Servicios:\n%-10s | %-20s | %-10s | %-10s\n\n", "Código", "Servicio", "Precio",
                        "Total");

                if (service.getIva() != 0.0) {
                    subtotal = (service.getPriceByUnit()); // precio sin iva
                    totalSubtotal = totalSubtotal + subtotal; // suma de subtotales

                    totalTemp = subtotal * ((service.getIva() / 100.0) + 1); // precio con iva
                    this.printServices(service, totalTemp); // se le imprime

                    ivaTotal = ivaTotal + (totalTemp - subtotal); // suma de solo iva

                    totalBill = totalBill + totalTemp; // total precio con impuestos
                } else {
                    totalTemp = (service.getPriceByUnit());
                    this.printServices(service, totalTemp);
                    totalWithoutIVA = totalWithoutIVA + totalTemp;
                    totalBill = totalBill + totalWithoutIVA;
                }
                totalTemp = 0;
                System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
                        "----------", "----------\n");
            }

        }
        System.out.printf("Subtotal 0%%: %.2f\nSubtotal 12%%: %.2f\nIVA 12%%: %.2f\nTotal: %.2f", totalWithoutIVA,
                totalSubtotal, ivaTotal, totalBill);
        return true;
    }

    // ENCABEZADO DE LA FACTURA
    public boolean header() {
        if (c.equals(null))
            return false;
        if (this.c.getTypeId().equals("1")) {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\t\tCédula: %s\n" +
                    "Correo Electrónico: %s\tCelular: %s\n"
                    + "Dirección: %s\t\tFecha: %s\n\n", this.c.getLastnames() + " " + this.c.getNames(), this.c.getId(),
                    this.c.getEmail(),
                    this.c.getPhoneNumber(), this.c.getAddress(), LocalDate.now());
            return true;

        } else {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\t\tRUC: %s\n" +
                    "Correo Electrónico: %s\tCelular: %s\n"
                    + "Dirección: %s\t\tFecha: %s\n\n", this.c.getLastnames() + " " + this.c.getNames(), this.c.getId(),
                    this.c.getEmail(),
                    this.c.getPhoneNumber(), this.c.getAddress(), LocalDate.now());
            return true;
        }

    }

    ////////////////////////////////////////
    // add,deque methods
    public void addProduct(Product product) {
        products.offer(product);
    }

    public void addService(Service service) {
        services.offer(service);
    }

    public Product removeProduct() {
        return products.poll();
    }

    public Service removeService() {
        return services.poll();
    }
}
