public class Phrases {
    private String phrase;
    private String category;
    
    public String getPhrase() {
        return phrase;
    }
    public String getCategory() {
        return category;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Phrases() {
    }
    public Phrases(String phrase, String category) {
        this.phrase = phrase;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Phrases [phrase=" + phrase + ", category=" + category + "]";
    }

    
}
