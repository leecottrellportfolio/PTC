import java.util.Scanner;

public class VoteClassLecture {
    public static void main(String[] args) throws Exception {
        String input;
        int votes;
        Candidate democrat = new Candidate();
        Candidate republican = new Candidate();
        Candidate other = new Candidate();
        Scanner keyboard = new Scanner(System.in);

        democrat.setParty("Democrat");
        republican.setParty("Republican");
        other.setParty("Write in");

        System.out.println("Enter the name of the democratic candidate");
        input = keyboard.nextLine();    //input holds the name
        democrat.setName(input);

        System.out.println("Votes for " + democrat.getName());
        //votes = keyboard.nextInt();
        input = keyboard.nextLine();//get votes as a string
        votes = Integer.parseInt(input);
        //keyboard.nextLine();
        democrat.setVotes(votes);
        
        System.out.println("Enter the name of the republican candidate");
       
        input = keyboard.nextLine();    //input holds the name
        republican.setName(input);
        //keyboard.nextLine();//clear the buffer

        System.out.println("Votes for " + republican.getName());
        input = keyboard.nextLine();//get votes as a string
        votes = Integer.parseInt(input);
        republican.setVotes(votes);

        System.out.println("Votes for Write In" );
        input = keyboard.nextLine();//get votes as a string
        votes = Integer.parseInt(input);
        other.setVotes(votes);
        other.setName("Write In");

        System.out.printf("%s %.2f %% of the vote\n", democrat.toString(), 
            democrat.getVotes()/(float) democrat.getTotalVotes() * 100);
        System.out.printf("%s %.2f %% of the vote\n",republican.toString(),
        republican.getVotes()/(float) republican.getTotalVotes() * 100);
        System.out.printf("%s %.2f %% of the vote\n",other.toString(),
        other.getVotes()/(float) other.getTotalVotes() * 100);

        keyboard.close();
    }
}
