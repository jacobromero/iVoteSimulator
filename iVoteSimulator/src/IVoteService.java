import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Jacob Romero on 10/11/2016.
 */

public class IVoteService {
    private List<Question> questionList = new LinkedList<Question>();
    public Question createQuestion(String text, String... answers) {
        Question question;
        if(answers.length == 2) {
            question = new RightWrongQuestion(text, answers);
        } else {
            question = new MultipleChoiceQuestion(text, answers);
        }

        questionList.add(question);
        return question;
    }

    public void getRawResults(Question q) {
        HashMap studentAnswers = q.getRawSubmittedAnswers();
        Set<String> keys = q.getRawSubmittedAnswers().keySet();
        for(String key : keys) {
            Object value = studentAnswers.get(key);
            if (value instanceof String) {
                System.out.println("Student " + key + " answered " + studentAnswers.get(key));
            } else {
                System.out.print("Student " + key + " answered : ");
                for(String answer : (String[]) value) {
                    System.out.print(answer + ", ");
                }
                System.out.println();
            }
        }
    }

    public void getAggregateResults(Question q) {
        Set<String> keys = q.getAggregateSubmittedAnswers().keySet();
        for(String key : keys) {
            System.out.println(q.getAggregateSubmittedAnswers().get(key) + " Students answered: " + key);
        }
    }
}
