import java.util.Scanner;

public class FaceDetection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Face Detection and Recognition ===");
        System.out.print("Enter person name (Alice, Bob, Charlie): ");
        String name = sc.nextLine().toLowerCase();

        if (name.equals("alice")) {
            System.out.println("Face Detected!");
            System.out.println("Recognized Person: Alice");
        } else if (name.equals("bob")) {
            System.out.println("Face Detected!");
            System.out.println("Recognized Person: Bob");
        } else if (name.equals("charlie")) {
            System.out.println("Face Detected!");
            System.out.println("Recognized Person: Charlie");
        } else {
            System.out.println("Face Detected!");
            System.out.println("Person Not Recognized.");
        }

        sc.close();
    }
}
