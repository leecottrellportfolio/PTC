public class Order {
    private String entree;
    private String drink;
    private String dessert;
    private double cost;

    //setters, getters, toString, 2 constructors

    public void setEntree(String ent){
        entree = ent;
        calcCost();
    }

    public void setDrink(String dri){
        drink = dri;
        calcCost();
    }

    public void setDessert(String des){
        dessert = des;
        calcCost();
    }

    public void setCost(double price){
        cost = price;
    }
    //getters

    public String getEntree(){
        return entree;
    }
    public String getDrink(){
        return drink;
    }
    public String getDessert(){
        return dessert;
    }
    public double getCost(){
        return cost;
    }

    public Order(){
        entree = "Steak";
        drink = "Water";
        dessert = "Cake";
        calcCost();
    }
    public Order(String ent, String des, String dri, double price){
        entree = ent;
        dessert = des;
        drink = dri;
        cost = price;
        calcCost();
    }
    public Order(String ent, String des, String dri){
        entree = ent;
        dessert = des;
        drink = dri;
        calcCost();
    }
    public String toString()
    {
        return entree + " " + drink + " " + dessert + " " + cost;
    }
    
     public double calcCost(){
        cost = 0;
        if(entree.equalsIgnoreCase("steak")){
            cost += 20;
        }
        else if(entree.equalsIgnoreCase("fish")){
            cost += 25;
        }
        else if(entree.equalsIgnoreCase("chicken")){
            cost += 15;
        }
        else{
            entree = "default chicken";
            cost += 15;
        }

        if(drink.equalsIgnoreCase("pop")){
            cost += 3;
        }
        else if(drink.equalsIgnoreCase("beer")){
            cost += 7;
        }
        else if(drink.equalsIgnoreCase("water")){
            cost += 0;
        }
        else{
            entree = "default water";
            cost += 0;
        }

        if(dessert.equalsIgnoreCase("cake")){
            cost += 5;
        }
        else if(dessert.equalsIgnoreCase("pie")){
            cost += 7;
        }
        else if(dessert.equalsIgnoreCase("cookie")){
            cost += 1;
        }
        else{
            entree = "default cookie";
            cost += 1;
        }
        return this.cost;
    }
    //functionality for a class
    //anything the class needs to do is coded as a method in the class
   
    

    
}
