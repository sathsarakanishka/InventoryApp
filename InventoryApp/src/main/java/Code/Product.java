/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Code;




public class Product  {
    
    private int code;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product (int code, String name, int quantity, double unitPrice) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getStockValue() {
        return quantity * unitPrice;
    }
 

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
