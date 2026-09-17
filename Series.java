public class Series {
    private String title;
    private String genre;
    private String language;
    private String mood;
    private double rating;

    public Series(String title, String genre, String language,
                  String mood, double rating) {
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.mood = mood;
        this.rating = rating;
}
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getMood() {
        return mood;
    }

    public double getRating() {
        return rating;
    }

    public void displaySeries() {
        System.out.println("------------------------------");
        System.out.println("Title    : " + title);
        System.out.println("Genre    : " + genre);
        System.out.println("Language : " + language);
        System.out.println("Mood     : " + mood);
        System.out.println("Rating   : " + rating);
    }
}