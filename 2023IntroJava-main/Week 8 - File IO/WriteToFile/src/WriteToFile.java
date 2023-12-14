import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteToFile {

    public static void SimpleWriteOut() {
        try {
            // FileWriter writer = new FileWriter("c:\\data\\lecture.txt");
            // opens the file for write
            // overwrites existing file
            FileWriter writer = new FileWriter("c:\\data\\lecture.txt", true);
            // opens file for appending
            // presenves existing file
            writer.write("This is the output\n");
            writer.write("I can write whatever I want\n");
            writer.flush();// forces the writer to finish
            writer.close();
        } catch (IOException iex) {
            System.out.println("SimpleWrieOUt File did not open");
            System.exit(-1);
        }
    }

    public static void getItemLine(FileWriter writer) {
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        String product="";
        double price=0;
        int quantity=0;
        double total=0;
        String output = "";
        do {
            System.out.println("Enter product quantity and price");
            System.out.println("Type done to quit");
            System.out.print("Product name -->");
            input = keyboard.nextLine();
            product = input;
            if (input.equalsIgnoreCase("done") == false) {
                System.out.print("How many " + product + "-->");
                input = keyboard.nextLine();
                // need try catches here - time willing

                try {
                    quantity = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    
                    quantity = 0;
                    product = "Error on quantity";
                    price = 0;
                    System.out.println("Redo product entry");
                }
                if (quantity > 0) {
                    //only ask for price if the quantity was valid
                    System.out.print("How much is " + product + "-->");
                    input = keyboard.nextLine();
                    try {
                        price = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                      
                        quantity = 0;
                        product = "Error on price";
                        price = 0;
                        System.out.println("Redo product entry");
                    }
                }
                total = price * quantity;

                output = String.format("%s, %d, %.2f, %.2f\n",
                        product, quantity, price, total);
            } // end if done
            else {
                output = "--------------------------\n";
            }
            try {
                writer.write(output);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println(output + " not written");
            }

        } while (input.equalsIgnoreCase("done") == false);

        keyboard.close();
        // return output;
    }

    public static void cashResgister(String fileName) {

        try {
            FileWriter writer = new FileWriter(fileName);
            // logic goes here
            getItemLine(writer);
            writer.flush();
            writer.close();
        } catch (IOException iex) {
            System.out.println(fileName + " did not open");
            System.exit(-1);
        }
    }

    public static void main(String[] args) throws Exception {
        // SimpleWriteOut();
        cashResgister("c:\\data\\receipt.csv");
        // String output;
        // output = getItemLine();
        // System.out.println(output);
    }
}
