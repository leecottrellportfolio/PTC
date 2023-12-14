import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int eggs = 50;
        int dozens = 0;
        int leftOver = 0;
        Scanner keyboard = new Scanner(System.in);
        //input
        System.out.println("Enter the number of eggs ");
        eggs = keyboard.nextInt();

        //processing
        dozens = eggs / 12;
        leftOver = eggs % 12;
        //output
        System.out.println("Eggs       : " + eggs);
        System.out.println("Full Dozens: " + dozens);
        System.out.println("Left over  : " + leftOver);

        keyboard.close();
    }
}
