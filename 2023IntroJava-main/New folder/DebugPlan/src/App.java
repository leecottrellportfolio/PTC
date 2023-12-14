public class App {

    public static void readPhrases(){
        
    }
    public static void main(String[] args) throws Exception {
        WordGame game = new WordGame();
        game.setPhrase("The Hunger Games");
        game.setPhrase("YA Books");
        game.showHidden();
    }
}
