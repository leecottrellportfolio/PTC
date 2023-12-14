import java.util.Scanner;
import java.io.*;

public class ReadTextFiles {

    /*
     * WOrking with files
     * 1. open the file - need the path and file name
     * 2. verify file opens - fix or close iƒit does not
     * 3. read the contents of the file
     * 4. do something with the contents
     * 5. close the file
     */

    public static void readPoetry() {
        String aLine;
        try {
            // open the file
            File frost = new File("c:\\data\\frost.txt");
            // File frost = new File("c:\\data\\datafiles\\frost.txt");
            // File frost = new File("c:\\users\\userName\\Desktop\\frost.txt");

            // if(frost.)
            Scanner frostRead = new Scanner(frost);
            // do my logic here
            while (frostRead.hasNextLine()) {
                aLine = frostRead.nextLine();
                System.out.println(aLine);
            }
            frostRead.close();// close the scanner

        } catch (FileNotFoundException fex) {
            System.out.println(fex.toString());
            System.out.println("frost is not found\n");
            System.exit(404);
        }
    }

    public static void stats() {
        int aNum = 0; // use for each line in the file
        int total = 0;
        int min = 1000;
        int max = -1000;
        double avg = 0.0;
        int count = 0;

        try {
            File rnums = new File("C:\\data\\randnumbers.csv");
            Scanner numIn = new Scanner(rnums);

            while (numIn.hasNextLine()) {
                try {
                    aNum = numIn.nextInt();

                } catch (Exception ex) {
                    //handle the exception 
                    //System.out.println("Read file " + ex.toString());
                    aNum = 0;// setting to an acceptable state
                    numIn.nextLine();// skip the offending line
                }
                // System.out.println(aNum);
                if (aNum > 0) {
                    total += aNum;
                    count++;
                    // min logic
                    if (aNum < min) {
                        min = aNum;
                    }
                    // max logic
                    if (aNum > max) {
                        max = aNum;
                    }//end if max
                }//end if aNum > 0
            }
            avg = total / (double) count;
            System.out.printf("Total %d\nAvg %.2f\nCount %d\nMax %d\nMin %d\n",
                    total, avg, count, max, min);
            numIn.close();
        } catch (FileNotFoundException fex) {
            System.out.println(fex.toString());
            System.out.println("c:\\data\\randomnumbers.csv not found");
            System.exit(404);
        }
    }

    public static void main(String[] args) throws Exception {
        readPoetry();
        stats();
    }
}
