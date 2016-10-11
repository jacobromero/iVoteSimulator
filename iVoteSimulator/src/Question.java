import java.util.HashMap;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public interface Question {
    void submit(String id, String... answer);
    String toString();
    HashMap getSubmittedAnswers();
}
