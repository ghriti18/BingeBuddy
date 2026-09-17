import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Series> seriesList = SeriesDatabase.getSeries();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("          BINGEBUDDY");
        System.out.println("   Netflix Series Recommendation");
        System.out.println("======================================");

        boolean running = true;

        while (running) {

            System.out.println("\n1. View All Series");
            System.out.println("2. Get Recommendation");
            System.out.println("3. Search Series");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Series:\n");

                    for (Series series : seriesList) {
                        series.displaySeries();
                    }
                    break;

                case 2:
                    scanner.nextLine();

                    System.out.println("\nWhat kind of mood are you in?");
                    System.out.println("1. Dark");
                    System.out.println("2. Exciting");
                    System.out.println("3. Funny");
                    System.out.println("4. Light");

                    System.out.print("\nEnter your choice: ");
                    int moodChoice = scanner.nextInt();

                    String selectedMood = "";

                    switch (moodChoice) {
                        case 1:
                            selectedMood = "Dark";
                            break;

                        case 2:
                            selectedMood = "Exciting";
                            break;

                        case 3:
                            selectedMood = "Funny";
                            break;

                        case 4:
                            selectedMood = "Light";
                            break;

                        default:
                             System.out.println("Invalid mood choice.");
                            break;
                    }

                    if (!selectedMood.isEmpty()) {

                        System.out.println("\n🎬 Recommendations for a "
                            + selectedMood + " mood:\n");

                        boolean found = false;

                        for (Series series : seriesList) {

                            if (series.getMood().equalsIgnoreCase(selectedMood)) {
                                series.displaySeries();
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Sorry, no series found for this mood.");
                        }
                    }

                    break;

                case 3:
                    scanner.nextLine();

                    System.out.print("\nEnter series name to search: ");
                    String searchName = scanner.nextLine();

                    boolean found = false;

                    for (Series series : seriesList) {

                        if (series.getTitle().toLowerCase()
                                .contains(searchName.toLowerCase())) {

                            System.out.println("\nSeries Found:");
                            series.displaySeries();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("\nSorry, no series found.");
                    }

                    break;

                case 4:
                    System.out.println("\nThank you for using BingeBuddy!");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
