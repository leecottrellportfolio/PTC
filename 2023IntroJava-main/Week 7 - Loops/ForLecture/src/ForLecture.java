import java.util.Scanner;
import java.util.*;

public class ForLecture {
    private static Scanner keyboard = new Scanner(System.in);
    private static Random rnd = new Random();
    //basic counting loop
    public static void countingLoop(){
        //display values from 1 to 10
        for(int x = 1; x <= 10; x++){
            System.out.println(x);
        }
    } 
    public static void countingLoop(int ending){
        //display values from 1 to 10
        //for(int x = 1; x <= ending; x++){
        for(int x = 1; x <= ending; x+= 2){
            System.out.println(x);
        }
    } 
    public static void countDown(){
        for(int c = 999; c >= 0; c--){
            System.out.printf("%5d", c);
            if(c % 10 == 0){
                System.out.println();
            }//end of if
        }
    }

    public static int calcAvgGrade(int numTests){
        int avg = 0;
        int test;
        int total = 0;  //accumulator variable
        int counter = 0;
        for(counter = 1; counter <= numTests; counter++){
            System.out.print("Enter test #" + counter  + "--> ");
            try{
                test = keyboard.nextInt();
            }
            catch(Exception ex){
                test = 0;
                System.out.println("Invalid score, setting to 0");
                keyboard.nextLine();    //read the string from the buffer
            }
            total += test;  //keep the running total
            //total = total + test;
        }
        if(numTests > 0){
            avg = total / numTests;
        }
        else{
            avg= -1;
        }
        return avg;
    }

    public static void printLine(int length){
        for(int i=0; i < length; i++){
            System.out.print("-");
        }
    }

    public static void printTimesTable(int number){
        int row =0, col = 0;
        int product = 0;
        for(row = 1; row <= number; row++){
            for(col = 1; col <= number; col++){
                product = row * col;    //number*number times
                System.out.printf("%4d", product);
            }//end of col
            //System.out.println();
            System.err.print("\n"); //faster
        }//end of row
    }//end of times table
    /*
     * while loop syntax
     * test before -- check the while condition before the loop executes - 0 to infinite executions
     * test after -- check the while condition after the loop executes once - 1 to infinite executions
     */
    public static double getInput(){
        //ensure number is > 0
        double input = 0;
        do{
            //body of loop
            System.out.print("Enter a number > 0 ");
            input = keyboard.nextDouble();
        }while(input <= 0);
        return input;
    }
    public static int breakEven(double cost, double profit, int units){
        int breakeven = 0;
        double overallProfit = -units * cost;
        //double salesTotal = 0;
        int productsSold = 0;
        double origProfit = profit;
        
        //fixed overhead - .25 per bottle
        //profit -= .25;
        while(overallProfit < 0){
            //keep looping while I am still losing money
            //random overhead per bottle
            //between 0 and 99 cents
            profit = origProfit - rnd.nextDouble();
            productsSold ++;
            overallProfit = (-units * cost) + productsSold * profit;
            System.out.println(productsSold + " " + overallProfit);
        }//end of while
        System.out.println("Profit made at " + productsSold);
        System.out.println("Overall profit " + overallProfit);
        return breakeven;
    }

    public static void menu(){
        //1-9 valid choices, 0 exit
        int choice = -1;
        String yourOrder = "";
        double price = 0;
        while(choice != 0){
            System.out.println("Welcome to Wendys, choose your food by number");
            System.out.println("1 for Single with Cheese");
            System.out.println("2 for Double with Cheese");
            System.out.println("3 for Triple with Cheese");
            System.out.println("4 for Salad");
            System.out.println("5 for desserts");
            System.out.println("0 to finish your order");
            choice = keyboard.nextInt();
            switch(choice){
                case 1:
                    yourOrder += "Single with cheese\n";
                    price += 4.50;
                    break;
                case 2:
                    yourOrder += "Double with cheese\n";
                    price += 5.50;
                    break;
                case 3:
                    yourOrder += "Triple with cheese\n";
                    price += 6.50;
                    break;
                case 4:
                    yourOrder += "Salad\n";
                    price += 7;
                    break;
                case 0:
                    System.out.println("Thank you for ordering");
                    System.out.println(yourOrder);
                    System.out.printf("Cost $%.2f", price);
                    break;
                default:
                    System.out.println(choice + " is not on the menu");
                    break;
                case 5:
                    System.out.println("Enter 10 for frosty");
                    System.out.println("Enter 11 for cookies");
                     choice = keyboard.nextInt();
                     switch (choice) {
                        case 10:
                            
                            break;
                     
                        default:
                            break;
                     }
            };
        }
    }
    
    /*public static void monteCarlo(){
        int atBats = 600;
        int walks = 0;
        int hits = 0;
        double avg = 0.0;
        int lowHit = 120, highHit = 260;
        int lowWalk = 0, highWalk = 50;
        int tries = 1000;
        int totHit = 0, totWalk = 0;
        double totAvg = 0.0;

        for(int b=0; b < tries; b++){
            walks = rnd.nextInt(highWalk + 1);//add one to get 50
            hits = rnd.nextInt(lowHit, highHit +1);
            avg = hits / (double)(atBats - walks);
            //System.out.printf("Hits %d Walks %d Avg %.3f\n", hits, walks, avg);
            totAvg += avg;
            totHit += hits;
            totWalk += walks;
        }//end of for loop
        
        //calc the averages
        hits = totHit/tries;
        walks = totWalk/tries;
        avg = totAvg / tries;
        System.out.printf("Hits %d Walks %d Avg %.3f\n", hits, walks, avg);
    } */
    public static void main(String[] args) throws Exception {
       // menu();
       monteCarlo();
     //   breakEven(1, 2, 1000);

        // for(int x = 1; x <=100; x ++){
        //     System.out.println("I am sorry");
        // }
        //double test = getInput();
       // System.out.println("You entered " + test);
        //printTimesTable(5);

        //printLine(20);
        //System.out.println();
       // printLine(15);
      /*   for(int line = 1; line <=20; line++){
            printLine(line);
            System.out.println();
        }
        */
       /*  String name = "Lee Cottrell";
        printLine(name.length());
        System.out.println("\n" + name);
        printLine(name.length());*/
        //countingLoop();
        //countingLoop(17);
        //countDown();
        //c++
        //int testAvg = calcAvgGrade(2);
        //System.out.println("Your average is " + testAvg);
        keyboard.close();
    }//end of main
}
