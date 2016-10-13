import java.util.HashMap;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class RightWrongQuestion implements Question {
    // Mapping of student.id -> answer in array for multiple choice questions
    HashMap<String, String> studentAnswers = new HashMap<String, String>();
    // Set of all possible answers
    HashMap<String, Integer> answerSet;
    // Text of the question to be answered
    private String questionText;

    public  RightWrongQuestion(String text, String... answers) {
        questionText = text;
        answerSet = new HashMap<String, Integer>();

        for(String answer : answers) {
            answerSet.put(answer, 0);
        }
    }

    // Add students answer to the map
    public void submit(String id, String... answer) {
        // Only add valid answers, update the answer of the student has submitted answer previously
        if(answerSet.containsKey(answer[0]) && answer.length == 1) {
            studentAnswers.put(id, answer[0]);
            answerSet.put(answer[0], answerSet.get(answer[0]) + 1);
        }
    }

    public String toString() {
        return questionText;
    }

    public HashMap getRawSubmittedAnswers() {
        return studentAnswers;
    }

    public HashMap getAggregateSubmittedAnswers() {
        return answerSet;
    }
}
