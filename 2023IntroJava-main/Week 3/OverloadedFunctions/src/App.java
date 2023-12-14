import java.text.DecimalFormat;

public class App {
    /*
     * overload == more than one definition or version in context
     * polymorphism --> many shapes
     */

      static double velocity(double height){
        double velo = 0;
        velo = Math.sqrt(2 * 9.8 * height);
        return velo;
     }
     static double velocity(double distance, double time){
        double velo = 0;
        velo = distance/time;
        return velo;
     }
     static double salesTax(double price){
        double tax = 0;
        tax = price * .06;
        return tax;
     }

     static double salesTax(double price, double taxRate){
        double tax = 0;
        tax = price * taxRate;
        return tax;
     }

     static double salesTax(double price, int taxRate){
        double tax = 0;
        tax = price * taxRate*.01;
        return tax;
     }

     /*
      * to overload your functions must differ
      by number of parameters
      type of parameters
      both number and type
      -----cannot differ by return type only-----
      */
    public static void main(String[] args) throws Exception {
        double height = 100;
        double speed = velocity(height);
        double distance = 60, time = 2;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Velocity from " + height + " = "
         + df.format(speed));

         speed = velocity(distance, time);
         System.out.printf("Velocity over %.2f miles in %.2f hours is %.2f\n", distance, time, speed);
         /*format specifiers
          * 
          %f -- float or double
          %d -- use for digits (integers)
          %s -- use for strings
          %20s -- 20 character wide string
          %-10.2f-- left align numbers
          */

         double f = force(250, 100);
         f = force(250, speed);
         f = force(250, velocity(distance, time));
        
    }//end of main

    public static double force(double mass, double velo){
        double ouch = 0;
        ouch = .5 * mass * velo;
        return ouch;
    }
}
