public class Food {
    private String name;
    private int calories;
    private double cost;
    
    //setters -- use to change the values
    public void setName(String n){
        name = n;
    }//end of setName

    public void setCalories(int Calories){
        calories = Calories;
    }//end of setCalories

    public void setCost(double Cost){
        cost = Cost;
    }//end of setCost

    //getters -- use to read the values
    public String getName(){
        return name;
    }//end of getName

    public int getCalories(){
        return calories;
    }//end of getCalories

    public double getCost(){
        return cost;
    }//end of getCOst

    //default constructor
    //name of the constructor is the name of the class
    public Food(){
        name="no food";
        calories = 0;
        cost = 0;
    }
    //parameterized constructor
    public Food(String Name, int Calories, double Cost){
        name = Name;
        calories = Calories;
        cost = Cost;
    }

    public String toString(){
        //build output
        String output = "";
        output = String.format("%s costs $%.2f and has %d calories",
                        name, cost, calories);
        return output;
    }

}//end of the class


