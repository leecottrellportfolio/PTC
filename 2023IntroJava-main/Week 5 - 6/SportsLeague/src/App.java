import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Team team1 = new Team("Eagles", "Elliott", "Cottrell");
        Team team2 = new Team("Orange Crush", "North Side", "Miller");
        Team team3 = new Team("Dragons", "Dormont", "Streib");
        Team team4 = new Team("Knights", "Kingston", "Andy");

        Game game1 = new Game(team1, team2, new Date(2023, 11, 12, 15, 0), 0, 0);
        Date g2 = new Date();
        g2.setYear(2023);
        g2.setMonth(10);
        g2.setDate(31);
        g2.setHours(10);
        g2.setMinutes(30);
        Game game2 = new Game(team1, team3, g2, 0,0);
        Date g3;
        Calendar cal = Calendar.getInstance();
        cal.set(2023, 12, 20, 9, 45);
        g3 = cal.getTime();
        Game game3 = new Game(team1, team4, g3, 0,0);

        System.out.println(game3.toString());

        game1.setHomeScore(5);
        game1.setAwayScore(3);
        System.out.println(game1.winner().getName() + " wins game 1");

        game2.setHomeScore(2);
        game2.setAwayScore(9);
        System.out.println(game2.winner().getName() + " wins game 2");

        game3.setHomeScore(10);
        game3.setAwayScore(9);
        System.out.println(game3.winner().getName() + " wins game 3");

    }
}
