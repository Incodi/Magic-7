import java.util.*;

/**
 * Play the Miller game
 *
 * @author Incodi
 * @version A
 */
public class Game {
    public static void main(String[] args) {
        MillerQueue queue = new MillerQueue();

        String question;
        
        System.out.print("Say STOP to exit.\n");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Give me a question: ");
            question = scanner.nextLine();
            
            if (question.equals("STOP")) {
                System.out.println("Goodbye.");
                break; // exit the loop
            }

            if (queue.contains(question)) {
                System.out.println("Answer: " + queue.getAnswer(question));
            } else {
                System.out.println("I do not know the answer to '" + question + "'");
                System.out.print("Tell me the answer: ");
                String neoAnswer = scanner.nextLine();
                queue.enqueue(question, neoAnswer);
            }
        }
        queue.display();
    }
}
