import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.nio.file.*;

public class App {

    public static List<People> peopleList = new ArrayList<People>();
    public static int counter = 0;

    public static String readEntireFile(String path){
        String contents = "";

        try {
            contents = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println(path + " did not open!!");
            System.exit(404);
        }

        return contents;
    }

    public static int findFname(String name){
        int nameCount = 0;

        for(int x=0; x < counter; x++){
            if(peopleList.get(x).getFname().equalsIgnoreCase(name)){
                nameCount ++;
                System.out.println(peopleList.get(x).getFname() + " " + 
                peopleList.get(x).getLname());
            }
        }
        return nameCount;
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        String json;
        json = readEntireFile("c:\\data\\people.json");
       // System.out.println(json);

        ObjectMapper mapper = new ObjectMapper();
        //tool from Jackson
        //convert JSON into a Java Class
        //needs a Java class with private fields, setters
        //POJO - Plain Old Java Object
        try{
            peopleList = mapper.readValue(json, new TypeReference<List<People>>(){

            });
             counter = peopleList.size();
             System.out.println(counter);
             System.out.println("Found " + findFname("Honor"));
        }
        catch(Exception ex){
            System.out.println("error " + ex.toString());
            System.exit(100);
        }
    }
}
