import java.util.Scanner;

public class App {
    public static double calcInsuranceRate(int age, String genderAtBirth) {
        double rate = 0;
        if (genderAtBirth.equalsIgnoreCase("male")) {
            if (age >= 16 && age < 25) {
                rate = 200;
            } else if (age >= 25 && age < 40) {
                rate = 150;
            } else if (age >= 40 && age < 55) {
                rate = 175;
            } else if (age >= 55 && age <= 100) {
                rate = 250;
            } else {
                System.out.println("Invalid age, between 16 and 100");
                rate = -1;
            } // end of if male
        } else if (genderAtBirth.equalsIgnoreCase("female")) {
            if (age >= 16 && age < 20) {
                rate = 200;
            } else if (age >= 20 && age < 35) {
                rate = 150;
            } else if (age >= 35 && age < 50) {
                rate = 175;
            } else if (age >= 50 && age <= 100) {
                rate = 250;
            } else {
                System.out.println("Invalid age, between 16 and 100");
                rate = -1;
            } // end of if female
        } else

        {
            System.out.println("Invalid gender at birth, male or female only");
            return -1;
        }
        return rate;
    }

    public static void main(String[] args) throws Exception {

        double insRate = 0;
        insRate = calcInsuranceRate(20, "male");
        System.out.println(insRate);

        insRate = calcInsuranceRate(20, "FEmale");
        System.out.println(insRate);
        /*
         * Scanner keyboard = new Scanner(System.in);
         * int age;
         * double tip = 20;
         * System.out.println("How old are you?");
         * age = keyboard.nextInt();
         * 
         * if(age >= 21 || tip > 20){
         * System.out.println("Have a beer");
         * }
         * else if(age >= 12 && age < 21){
         * System.out.println("Have some pop");
         * }
         * else if(age >=5 && age < 12){
         * System.out.println("Have some milk");
         * }
         * else if(age >=1 && age < 5){
         * System.out.println("Have some water");
         * }
         * else{
         * System.out.println("Error - invalid age must be 1 or greater");
         * System.exit(-1);//stops the program
         * }
         * System.out.println("Thank you for choosing Moes Bar");
         * 
         */
    }
}
