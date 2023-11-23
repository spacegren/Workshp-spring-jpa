package Entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                +", $ "
                +String.format("%.2f%n" , price)
                +", "
                +quantity
                +" unitis, total : $ "
                + String.format("%.2f%n",totalValueInStock());

    }



}
