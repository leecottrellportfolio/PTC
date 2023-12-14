public class Team{
    private String name;
    private String community;
    private String coach;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }
    public String getCoach() {
        return coach;
    }
    public void setCoach(String coach) {
        this.coach = coach;
    }
    public Team() {
    }
    public Team(String name, String community, String coach) {
        this.name = name;
        this.community = community;
        this.coach = coach;
    }
    @Override
    public String toString() {
        return "Team [name=" + name + ", community=" + community + ", coach=" + coach + "]";
    }

}