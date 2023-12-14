import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    private static Record recordList[] = new Record[9];
    public static int readRecordFile(String path){
        int count = 0;//count records read
        File file = new File(path);
        String line;
        
        try {
            Scanner fileIn = new Scanner(file);
            while(fileIn.hasNextLine()){
                line = fileIn.nextLine();
                
                String columns[] = line.split(",");//split on the comma
                //System.out.println(columns[0]);
                //System.out.println(columns[1]);
               //System.out.println(columns[2]);
               recordList[count] = new Record(columns[0], columns[1],
                    Integer.parseInt(columns[2]));
                //System.out.println(line);
               //System.out.println(recordList[count].toString());
               count++;
                
            }//end of while
            fileIn.close();//close the scanner
            //end of try block
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println(path + " not found, closing\n");
            System.exit(404);
        }
        return count;
    }

    public static void findYear(int year){
        for(int y=0; y < recordList.length; y++){
            if(recordList[y].getYear() == year){
                System.out.println(recordList[y].getTitle() + " by " + recordList[y].getArtist());
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int count = readRecordFile("c:\\data\\records.csv");
        System.out.println(count + " records read");
        findYear(1976);
    }
}
