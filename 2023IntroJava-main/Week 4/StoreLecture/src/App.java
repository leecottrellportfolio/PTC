public class App {
    public static void main(String[] args) throws Exception {
        Receipt line1 = new Receipt("Screwdrivers",  2.5, 10);
        Receipt line2 = new Receipt();
        //simulate user input
        String product = "Hammers";
        int quantity = 15;
        double price = 3.75;
        line2.setItem(product);
        line2.setQuantity(quantity);
        line2.setCost(price);

        System.out.println(line2.getItem() + " will cost " + line2.calcLineCost());


        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.printf("There are %d lines in the receipt\n",    line1.count);
    }
}
