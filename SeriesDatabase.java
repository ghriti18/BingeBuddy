import java.util.ArrayList;
public class SeriesDatabase {
     public static ArrayList<Series> getSeries() {

        ArrayList<Series> seriesList = new ArrayList<>();

        seriesList.add(new Series(
                "Dark",
                "Sci-Fi, Mystery, Thriller",
                "German",
                "Dark",
                8.7
        ));
        seriesList.add(new Series(
                "Stranger Things",
                "Sci-Fi, Mystery, Horror",
                "English",
                "Exciting",
                8.6
        ));

        seriesList.add(new Series(
                "Alice in Borderland",
                "Thriller, Mystery, Sci-Fi",
                "Japanese",
                "Dark",
                7.7
        ));

        seriesList.add(new Series(
                "Wednesday",
                "Mystery, Comedy, Fantasy",
                "English",
                "Dark",
                8.0
        ));

         seriesList.add(new Series(
                "Money Heist",
                "Crime, Thriller, Drama",
                "Spanish",
                "Exciting",
                8.2
        ));

        seriesList.add(new Series(
                "Brooklyn Nine-Nine",
                "Comedy",
                "English",
                "Funny",
                8.4
        ));

         seriesList.add(new Series(
                "The Good Place",
                "Comedy, Fantasy",
                "English",
                "Light",
                8.2
        ));

        seriesList.add(new Series(
                "The Witcher",
                "Fantasy, Action, Drama",
                "English",
                "Dark",
                8.0
        ));

        return seriesList;
    }
}

