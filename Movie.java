public class Movie extends ItemForSale {
    private int movieDuration;
    private String creator;
    
    public Movie(String name, double price, String creator, int movieDuration) {
        super(name, price);
        this.creator = creator;
        this.movieDuration = movieDuration;
    }

    public String getCreator() {
        return creator;
    }

    public int getDuration() {
        return movieDuration;
    }
}
