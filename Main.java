import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Series> seriesList = SeriesDatabase.getSeries();

        System.out.println("======================================");
        System.out.println("          BINGEBUDDY");
        System.out.println("   Netflix Series Recommendation");
        System.out.println("======================================");

        System.out.println("\nAvailable Series:\n");

        for (Series series : seriesList) {
            series.displaySeries();
        }
    }
}
