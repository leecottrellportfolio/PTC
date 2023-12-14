public class FoodMain {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Food apple = new Food("apple", 100, 1.5);
        Food orange = new Food();
        //do input and output to get the properties
        orange.setName("Naval Orange");
        orange.setCalories(250);
        orange.setCost(2.5);
        System.out.println(orange);
        System.out.println(apple.toString());

        double cost = apple.getCost() + orange.getCost();
        System.out.println("I ate " + apple.getName() + " and " + orange.getName() + " costing " + cost);
    }
}
