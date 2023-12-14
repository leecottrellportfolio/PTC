public class Candidate {
    private String name;
    private String party;
    private int votes;
    private static int totalVotes = 0;  //readonly property
//setters
    public void setName(String n){
        name = n;
    }
    public void setParty(String p){
        party = p;
    }
    public void setVotes(int v){
        votes = v;
        totalVotes += v;    //totalVotes = totalVotes + v;
    }
//getters
    public String getName(){
        return name;
    }
    public String getParty(){
        return party;
    }
    public int getVotes(){
        return votes;
    }
    public int getTotalVotes(){
        return totalVotes;
    }
//constructors
    public Candidate(){
        name = "candidate name";
        party = "party name";
        votes = 0;
    }
    public Candidate(String n, String p, int v){
        name = n;
        party = p;
        votes = v;
    }
    public String toString(){
        String output = "";
        output = String.format("%s received %d votes", name, votes);
        return output;
    }
}
