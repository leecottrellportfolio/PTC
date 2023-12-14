import java.util.*;
public class Triangle {
    public static void main(String[] args) throws Exception {
        double base = 0;
        double height = 0;
        double hypotenuse = 0;
        double area = 0;
        double perim = 0;
        double radicand;
        Scanner keyboard = new Scanner(System.in);
        //input
        System.out.print("Enter the base -->");
        base = keyboard.nextDouble();

       

        System.out.print("Enter the height -->");
        height = keyboard.nextDouble();

        //processing

        area = 1/(double)2 * base * height;//type cast double
        //area = .5 * base * height;
        //area= 1/2.0 * base * height;

        //radicand = Math.pow(base, 2) + Math.pow(height, 2);
       // hypotenuse = Math.sqrt(radicand);
        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        //hypotenuse = 
        perim = base + height + hypotenuse;

        //output
        System.out.println("Triangle with base " + base
        + " and height of " + height);

        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Area      : " + area);
        System.out.println("Perimeter : " + perim);

        keyboard.close();
    }
}
