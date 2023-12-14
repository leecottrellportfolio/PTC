import java.util.Date;
import java.util.Objects;
public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Date gameDateTime;
    private int homeScore;
    private int awayScore;


    public Game() {
        gameDateTime = new Date();//this is right now
    }

    public Game(Team homeTeam, Team awayTeam, Date gameDateTime, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameDateTime = gameDateTime;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Date getGameDateTime() {
        return this.gameDateTime;
    }

    public void setGameDateTime(Date gameDateTime) {
        this.gameDateTime = gameDateTime;
    }

    public int getHomeScore() {
        return this.homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return this.awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public Game homeTeam(Team homeTeam) {
        setHomeTeam(homeTeam);
        return this;
    }

    public Game awayTeam(Team awayTeam) {
        setAwayTeam(awayTeam);
        return this;
    }

    public Game gameDateTime(Date gameDateTime) {
        setGameDateTime(gameDateTime);
        return this;
    }

    public Game homeScore(int homeScore) {
        setHomeScore(homeScore);
        return this;
    }

    public Game awayScore(int awayScore) {
        setAwayScore(awayScore);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(homeTeam, game.homeTeam) && Objects.equals(awayTeam, game.awayTeam) && Objects.equals(gameDateTime, game.gameDateTime) && homeScore == game.homeScore && awayScore == game.awayScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam, gameDateTime, homeScore, awayScore);
    }

    @Override
    public String toString() {
        return "{" +
            " homeTeam='" + getHomeTeam() + "'" +
            ", awayTeam='" + getAwayTeam() + "'" +
            ", gameDateTime='" + getGameDateTime() + "'" +
            ", homeScore='" + getHomeScore() + "'" +
            ", awayScore='" + getAwayScore() + "'" +
            "}";
    }
    //my functionality here
    public Team winner(){
        Team result = new Team("Tie", "No Winner", "");

        if(homeScore > awayScore){
            result = homeTeam;
        }
        else if(homeScore < awayScore){
            result = awayTeam;
        }
        else{
            result.setCoach("Tied at " + awayScore);
        }

        return result;
    }
    
}//bottom of class
