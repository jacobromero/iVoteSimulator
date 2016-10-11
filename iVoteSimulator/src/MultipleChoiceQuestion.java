import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class MultipleChoiceQuestion implements Question {
    // Mapping of student.id -> answer(s) in array for multiple choice questions
    HashMap<String, String[]> studentAnswers = new HashMap<String, String[]>();
    // Set of all possible answers
    HashSet<String> answerSet;
    // Text of the question to be answered
    private String questionText;

    public MultipleChoiceQuestion(String text, String... answers) {
        questionText = text;
        answerSet = new HashSet<String>(Arrays.asList(answers));
    }

    // Student submitted answers
    public void submit(String id, String... answers) {
        studentAnswers.put(id, answers);
    }

    public String toString() {
        return questionText;
    }

    public HashMap getSubmittedAnswers() {
        return studentAnswers;
    }
}
