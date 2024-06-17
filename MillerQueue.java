import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Queue made to act like Miller's magic number 7.
 *
 * @author Incodi
 * @version B
 */

public class MillerQueue {
    private LinkedList<QuestionAnswerPair> queue;
    private int capacity;
    private Map<String, String> questionAnswerMap;

    public MillerQueue() {
        this.capacity = 7;
        this.queue = new LinkedList<>();
        this.questionAnswerMap = new HashMap<>();
    }

    public void enqueue(String question, String answer) {
        if (isFull()) {
            dequeue();
            queue.addLast(new QuestionAnswerPair(question, answer));
            questionAnswerMap.put(question, answer);
        } else {
            queue.addLast(new QuestionAnswerPair(question, answer));
            questionAnswerMap.put(question, answer);
        }
    }

    public QuestionAnswerPair dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        } else {
            QuestionAnswerPair removedPair = queue.removeFirst();
            questionAnswerMap.remove(removedPair.getQuestion());
            return removedPair;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }

    public int size() {
        return queue.size();
    }

    public void display() {
        System.out.println("Queue:");
        for (QuestionAnswerPair pair : queue) {
            System.out.println("Question: " + pair.question + " Answer: " + pair.answer);
        }
        System.out.println();
    }

    public boolean contains(String question) {
        return questionAnswerMap.containsKey(question);
    }

    public String getAnswer(String question) {
        return questionAnswerMap.get(question);
    }
}



