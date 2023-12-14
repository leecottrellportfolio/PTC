import java.text.DecimalFormat;
import java.util.*;
public class App {

    public static double calcBMI(int weight, int totInches){
        double ans = 0;
        double top = weight * 703;
        double bottom = Math.pow(totInches, 2);

        ans = top/bottom;
        return ans;
    }
    public static int convertToInches(int feet, int inches){
        int tot = 0;
        tot = feet * 12 + inches;
        return tot;
    }
    public static void output(int feet, int inches, int totInches,  int weight, double BMI){

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(feet + " ft " + inches + " inches");
        System.out.println(totInches + " height in inches");
        System.out.println(weight+ " pounds");
       // System.out.println(df.format(BMI) + " BMI");
       System.out.printf("%.1f BMI\n", BMI);
    }
    public static void main(String[] args) throws Exception {
        double BMI=0;
        int feet=0, inches=0, totInches=0, weight = 0;
        Scanner keyboard = new Scanner(System.in);
        //input
        System.out.print("Enter height in feet and inches (ex 5 10)->");
        feet = keyboard.nextInt();
        inches = keyboard.nextInt();
         System.out.print("How much do you weigh->");
        weight = keyboard.nextInt();

        //processing
        totInches = convertToInches(feet, inches);
        BMI = calcBMI(weight, totInches);

        //output
        output(feet, inches, totInches, weight, BMI);
        keyboard.close();
    }//end of main

}//end of class
