public class Record {
    private String title;
    private String artist;
    private int year;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Record() {
    }
    public Record(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Record [title=" + title + ", artist=" + artist + ", year=" + year + "]";
    }

    //setters, getters, tostring, constructors

    
    
}
