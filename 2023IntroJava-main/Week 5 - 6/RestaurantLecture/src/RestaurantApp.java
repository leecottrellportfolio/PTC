public class RestaurantApp {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Order order1 = new Order("Steak", "Cake", "Water");
        Order order2 = new Order("Fish", "Pie", "Pop");
        Order order3 = new Order("Chicken", "Cookie", "Beer");
        double totalCost = order1.getCost() + order2.getCost() + order3.getCost();

        /*
         * Order order4 = new Order();
         * //get data
         * order4.setEntree(input);
         * 
         */
        
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());
        System.out.println("Total cost = " + totalCost);
    }
}

