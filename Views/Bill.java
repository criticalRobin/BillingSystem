package Views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import Models.Client;
import Models.Product;
import Models.Service;

public class Bill {
    Queue<Product> products;
    Queue<Service> services;
    Client c;
    double totalBill;

    public Bill(Client client) {
        this.c = client;
        this.products = new LinkedList<>();
        this.services = new LinkedList<>();
        totalBill = 0;
    }

    public void printProducts(Product p, double total) {
        System.out.printf("%-10d | %-20s | %-10.2f | %-10.2f\n\n", p.getQuantity(), p.getName(), p.getPriceByUnit(),
                total);
    }

    public void printServices(Service s, double total) {
        System.out.printf("%-10s | %-20s | %-10.2f | %-10.2f\n\n", s.getId(), s.getName(), s.getPriceByUnit(), total);
    }

    public boolean calculateTotal() {
        double totalTemp = 0; // almaccena el total de un producto
        double subtotal = 0; // es el precio del producto sin impuestos
        double totalWithoutIVA = 0; // es el subtotal sin iva de todo
        double totalSubtotal = 0; // es el subtotal con iva de todo
        double ivaTotal = 0; // suma de solo el iva

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
                    this.totalBill = this.totalBill + totalTemp;

                } else {
                    totalTemp = (product.getQuantity() * product.getPriceByUnit());
                    this.printProducts(product, totalTemp);

                    totalWithoutIVA = totalWithoutIVA + totalTemp; // subtotal de 0
                    this.totalBill = this.totalBill + totalWithoutIVA;
                }
                totalTemp = 0;
                System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
                        "----------", "----------\n");
            }

        }
        if (!services.isEmpty()) {
            for (Service service : services) {
                System.out.printf("\nServicios:\n%-10s | %-20s | %-10s | %-10s\n\n", "Código", "Servicio", "Precio",
                        "Total");
                if (service.getIva() != 0.0) {
                    subtotal = (service.getPriceByUnit()); //precio sin iva
                    totalSubtotal = totalSubtotal + subtotal; //suma de subtotales
                    
                    totalTemp = subtotal*((service.getIva()/100.0)+1); //precio con iva
                    this.printServices(service, totalTemp); // se le imprime

                    ivaTotal = ivaTotal +(totalTemp-subtotal); // suma de solo iva

                    this.totalBill = this.totalBill + totalTemp; // total precio con impuestos
                } else {
                    totalTemp = (service.getPriceByUnit());
                    this.printServices(service, totalTemp);
                    totalWithoutIVA = totalWithoutIVA + totalTemp;
                    this.totalBill = this.totalBill + totalWithoutIVA;
                }
                totalTemp = 0;
                System.out.printf("%-10s | %-20s | %-10s | %-10s", "----------", "--------------------",
                        "----------", "----------\n");
            }

        }
        System.out.printf("\t\t\tSubtotal 0%%: %.2f\n\t\t\tSubtotal 12%%: %.2f\n\t\t\tIVA 12%%: %.2f\n\t\t\tTotal: %.2f\n",totalWithoutIVA, totalSubtotal, ivaTotal, this.totalBill);
        this.footer();
        return true;
    }

    // ENCABEZADO DE LA FACTURA
    public boolean header() {
        if (c.equals(null)) {
            return false;
        }

        if (this.c.getTypeId().equals("1")) {
            System.out.println("********************************Factura**********************************");
            System.out.printf("Cliente: %s\t\tCédula: %s\n" +
                    "Correo Electrónico: %s\t\tCelular: %s\n"
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

    public void footer() {
        int numeroAleatorio = new Random().nextInt(100000000); // número aleatorio de hasta 8 dígitos
        String factura = "Documento Número: " + numeroAleatorio;
        String printTime = "Hora de impresión: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.printf("%s\n%s\n<NO SE ACEPTAN DEVOLUCIONES>\n\t\t\t¡Gracias por su compra!\n", factura, printTime);
    }

    // add,deque methods
    public void addProduct(Product product, int quantity) {
        if (products.contains(product)) {
            product.setQuantity(product.getQuantity() + quantity);
            products.remove(product);
        } else {
            product.setQuantity(quantity);
        }
        products.offer(product);
    }

    public void addService(Service service) {
        if (!services.contains(service))
            services.offer(service);
        else
            System.out.println("Ya agrego este servicio");
    }

    public Product removeProduct() {
        return products.poll();
    }

    public Service removeService() {
        return services.poll();
    }
}