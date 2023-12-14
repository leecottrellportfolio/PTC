import java.util.Scanner;//need for scanner
public class App {
    public static void main(String[] args) throws Exception {
        int hours;
        double rate = 15.75;
        double pay;
        hours = 40;
        Scanner keyboard = new Scanner(System.in);
        //input 
            //prompt - tell the users what to type
            //get the input
        
        System.out.print("Enter hours worked ");
        hours = keyboard.nextInt();

        System.out.print("Enter our hourly rate ");
        rate = keyboard.nextDouble();

            
        //expression
        //process
        pay = rate * hours;
        
        //output
        System.out.println("You worked " + hours + " hours");
        System.out.println("At a $" + rate + " pay rate");
        //echoing the input
        System.out.println("You earned $" + pay);

        keyboard.close();
    }
}
