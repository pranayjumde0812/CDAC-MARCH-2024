package pojo;

import java.time.LocalDate;

public class Pen {

    private int pid;
    private String brand;
    private String penColor;
    private String inkColor;
    private String material;
    private int stock;
    private LocalDate stockUpdateDate;
    private LocalDate stockListingDate;
    private double price;
    private double discount;

    private static int uid;

    public Pen() {
    }

    public Pen(String brand, String penColor, String inkColor,
               String material, int stock, LocalDate stockUpdateDate, LocalDate stockListingDate,
               double price, double discount) {
        this.pid = ++uid;
        this.brand = brand;
        this.penColor = penColor;
        this.inkColor = inkColor;
        this.material = material;
        this.stock = stock;
        this.stockUpdateDate = stockUpdateDate;
        this.stockListingDate = stockListingDate;
        this.price = price;
        this.discount = discount;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getStockUpdateDate() {
        return stockUpdateDate;
    }

    public void setStockUpdateDate(LocalDate stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }

    public LocalDate getStockListingDate() {
        return stockListingDate;
    }

    public void setStockListingDate(LocalDate stockListingDate) {
        this.stockListingDate = stockListingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "pid=" + pid +
                ", brand='" + brand + '\'' +
                ", penColor='" + penColor + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", material='" + material + '\'' +
                ", stock=" + stock +
                ", stockUpdateDate=" + stockUpdateDate +
                ", stockListingDate=" + stockListingDate +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
