import java.util.Scanner;

public class ImageCaptioningAI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Image Captioning AI ===");
        System.out.print("Enter image name (cat, dog, car, flower): ");
        String image = sc.nextLine().toLowerCase();

        if (image.equals("cat")) {
            System.out.println("Caption: A cute cat is sitting on the floor.");
        } else if (image.equals("dog")) {
            System.out.println("Caption: A happy dog is playing in the park.");
        } else if (image.equals("car")) {
            System.out.println("Caption: A red car is parked on the road.");
        } else if (image.equals("flower")) {
            System.out.println("Caption: A beautiful flower is blooming in the garden.");
        } else {
            System.out.println("Caption: Unable to identify the image.");
        }

        sc.close();
    }
}
