import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Movie Recommendation System ===");
        System.out.print("Enter your favorite genre (action, comedy, thriller, romance): ");
        String genre = sc.nextLine().toLowerCase();

        if (genre.equals("action")) {
            System.out.println("Recommended Movies:");
            System.out.println("- Avengers");
            System.out.println("- John Wick");
            System.out.println("- Mad Max");
        } else if (genre.equals("comedy")) {
            System.out.println("Recommended Movies:");
            System.out.println("- Home Alone");
            System.out.println("- Mr. Bean");
            System.out.println("- The Mask");
        } else if (genre.equals("thriller")) {
            System.out.println("Recommended Movies:");
            System.out.println("- Inception");
            System.out.println("- Prisoners");
            System.out.println("- Se7en");
        } else if (genre.equals("romance")) {
            System.out.println("Recommended Movies:");
            System.out.println("- Titanic");
            System.out.println("- The Notebook");
            System.out.println("- La La Land");
        } else {
            System.out.println("Sorry! No recommendations available.");
        }

        sc.close();
    }
}
