package Entities;

public class encapsulamento_Executer_Um {
    private String name;
    private int quantity;
    private double price;

    public encapsulamento_Executer_Um(){

    }



    public encapsulamento_Executer_Um(String productName , int Quantity , double Price){
        this.name = productName;
        this.price = Price;
        this.quantity = Quantity;

    }

    public encapsulamento_Executer_Um(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += price;
    }
    public void removeProducts(){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                +", $ "
                +String.format("%.2f%n " , price)
                +" , "
                +quantity
                +" UNITS , TOTAL : $ "
                +String.format("%.2f%n " ,totalValueInStock());
    }


}
