import java.util.HashMap;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class MultipleChoiceQuestion implements Question {
    // Mapping of student.id -> answer(s) in array for multiple choice questions
    HashMap<String, String[]> studentAnswers = new HashMap<String, String[]>();
    // Set of all possible answers
    HashMap<String, Integer> answerSet;
    // Text of the question to be answered
    private String questionText;

    public MultipleChoiceQuestion(String text, String... answers) {
        questionText = text;
        answerSet = new HashMap<String, Integer>();

        for (String answer : answers) {
            answerSet.put(answer, 0);
        }
    }

    // Student submitted answers
    public void submit(String id, String... answers) {
        studentAnswers.put(id, answers);
        for(String answer : answers) {
            answerSet.put(answer, answerSet.get(answer) + 1);
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
