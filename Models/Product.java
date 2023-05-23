package Models;

public class Product {
    private String id;
    private String name;
    private double priceByUnit;
    private String uMeasure;
    private double iva;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, double priceByUnit, String uMeasure, double iva) {
        this.id = id;
        this.name = name;
        this.priceByUnit = priceByUnit;
        this.uMeasure = uMeasure;
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

    public String getuMeasure() {
        return uMeasure;
    }

    public void setuMeasure(String uMeasure) {
        this.uMeasure = uMeasure;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

}
