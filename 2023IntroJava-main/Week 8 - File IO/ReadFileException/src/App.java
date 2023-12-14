import java.util.Scanner;
import java.io.*;

public class App {
    static Scanner keyboard = new Scanner(System.in);

    // handle exceptions with file not found
    public static void readFile() {
        String fileName;
        String basePath = "c:\\data\\";
        String fullName;
        String aLine;
        boolean noFile = true; // flag

        do {
            System.out.print("Enter the file name ");
            fileName = keyboard.nextLine();
            fullName = basePath + fileName;
            System.out.println(fullName);

            try {
                File theFile = new File(fullName);
                Scanner readFile = new Scanner(theFile);
                noFile = false;// set the flag
                               // file exists
                while (readFile.hasNextLine()) {
                    aLine = readFile.nextLine();
                    System.out.println(aLine.toUpperCase().replace("E", "3"));
                }
                readFile.close();
            } catch (FileNotFoundException fex) {
                // System.out.println(fex.toString());
                System.out.println(fullName + " is not found\n");
                // System.exit(404);
                noFile = true;// keep looping
                              // set the flag
            }
            // end of catch
        } while (noFile == true);
    }

    public static void main(String[] args) throws Exception {
        String openFile="yes";
        
        while(openFile.endsWith("yes")){
            readFile();
            System.out.println("Do you want to open a file? <yes/no>");
            openFile = keyboard.nextLine();
        }
        
    }
}
