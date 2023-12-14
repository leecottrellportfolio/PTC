public class Receipt {
    private String item;
    private double cost;
    private int quantity;

    //keep a count across instances
    public static int count = 0;
    //one version of count across ALL instances of Receipt

    //setters and getters

    public void setItem(String product){
        item = product;
    }
    public void setCost(double cost){
        this.cost = cost;   //the this pointer
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getItem(){
        return item;
    }
    public double getCost(){
        return cost;
    }
    public int getQuantity(){
        return quantity;
    }
    //constructor
    public Receipt(){
        item="";
        cost=0;
        quantity=0;
        count++;
    }

    public Receipt(String name, double price, int number){
        item = name;
        cost = price;
        quantity = number;
        count++;
    }

    //toString - optional
    public String toString(){
        String output;
        output = String.format("%-15s %5d %10.2f %10.2f", 
                item, this.quantity, this.cost, calcLineCost());
        return output;
    }
    //method and functionality

    public double calcLineCost(){
        double lineCost = cost * quantity;
        return lineCost;
    }

}
