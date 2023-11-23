package Entities;

public class executer_Constructor {
    public String productName;
    public double Quantity;
    public double Price;

    public executer_Constructor(String productName , int Quantity , double Price){
        this.productName = productName;
        this.Price = Price;
        this.Quantity = Quantity;

    }

    public double totalValueInStock(){
        return Price * Quantity;
    }
    public void addProducts(int quantity){
        this.Quantity += Price;
    }
    public void removeProducts(){
        this.Quantity -= Quantity;
    }
    public String toString(){
        return productName
                +", $ "
                +String.format("%.2f%n " , Price)
                +" , "
                +Quantity
                +" UNITS , TOTAL : $ "
                +String.format("%.2f%n " ,totalValueInStock());
    }


}
