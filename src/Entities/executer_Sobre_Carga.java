package Entities;

public class executer_Sobre_Carga {
    public String name;
    public double quantity;
    public double price;

    public executer_Sobre_Carga(){

    }

    public executer_Sobre_Carga(String productName , int Quantity , double Price){
        this.name = productName;
        this.price = Price;
        this.quantity = Quantity;

    }

    public executer_Sobre_Carga(String name, double price){
        this.name = name;
        this.price = price;
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
