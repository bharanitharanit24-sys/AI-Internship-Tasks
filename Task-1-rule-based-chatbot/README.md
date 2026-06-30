import java.util.Scanner;

public class RuleBasedChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Rule-Based Chatbot =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.equals("how are you")) {
                System.out.println("Bot: I'm fine. Thank you! How are you?");
            }
            else if (input.equals("what is your name")) {
                System.out.println("Bot: My name is RuleBot.");
            }
            else if (input.equals("who created you")) {
                System.out.println("Bot: I was created using Java programming.");
            }
            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand your question.");
            }
        }

        sc.close();
    }
}
