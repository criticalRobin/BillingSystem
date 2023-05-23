package Models;

public class Service {
    private String id;
    private String name;
    private double priceByUnit;
    private double iva;

    public Service() {
    }

    public Service(String id, String name, double priceByUnit, double iva) {
        this.id = id;
        this.name = name;
        this.priceByUnit = priceByUnit;
        this.iva = iva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceByUnit() {
        return priceByUnit;
    }

    public void setPriceByUnit(double priceByUnit) {
        this.priceByUnit = priceByUnit;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    
}
