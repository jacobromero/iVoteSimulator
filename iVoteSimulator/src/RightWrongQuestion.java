import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class RightWrongQuestion implements Question {
    // Mapping of student.id -> answer in array for multiple choice questions
    HashMap<String, String> studentAnswers = new HashMap<String, String>();
    // Set of all possible answers
    HashSet<String> answerSet;
    // Text of the question to be answered
    private String questionText;

    public  RightWrongQuestion(String text, String... answers) {
        questionText = text;
        answerSet = new HashSet<String>(Arrays.asList(answers));
    }

    // Add students answer to the map
    public void submit(String id, String... answer) {
        // Only add valid answers, update the answer of the student has submitted answer previously
        if(answerSet.contains(answer[0]) && answer.length == 1) {
            studentAnswers.put(id, answer[0]);
        }
    }

    public String toString() {
        return questionText;
    }

    public HashMap getSubmittedAnswers() {
        return studentAnswers;
    }
}
