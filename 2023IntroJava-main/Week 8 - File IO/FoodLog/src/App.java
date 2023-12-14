import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.nio.file.*;

public class App {

static List<People> peopleList = new ArrayList<People>();
static int counter = 0;

  
    public static String readAllLines(String path) {
        // https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
    public static void printTop(int num){
        for(int x=0; x < num; x++){
            System.out.println(peopleList.get(x).getFname() + " " + peopleList.get(x).getLname());
        }
    }

    public static void countNames(String name){
        //use for each loop just because
        int nameCount = 0;
        for(People aPerson : peopleList){
            if(aPerson.getFname().equalsIgnoreCase(name)){
                nameCount ++;
                System.out.println(aPerson.toString());
            }//end of if
        }//end of for
        System.out.println(name + "'s found = " + nameCount);
    }

    public static void main(String[] args) throws Exception {
        String json;
      //  People aPerson;
        ObjectMapper mapper = new ObjectMapper();
        json = readAllLines("c:\\data\\people.json");
        //System.out.println(json);

        try {
            peopleList = mapper.readValue(json, new TypeReference<List<People>>(){});
            counter = peopleList.size();
            System.out.println("Lines read " + counter);
            printTop(10);
            //countNA();
            countNames("Honor");
            
        } catch (JsonMappingException e) {

            System.out.println("Mappng exception " + e.toString());
        } catch (JsonProcessingException e) {
  
            System.out.println("Processing exception " + e.toString());
        }


    }
}
