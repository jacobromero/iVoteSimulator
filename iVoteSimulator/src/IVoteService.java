import java.util.Set;

/**
 * Created by Jacob Romero on 10/11/2016.
 */

public class IVoteService {
    Question q;
    public Question createQuestion(String text, String... answers) {
        if(answers.length == 2) {
            q = new RightWrongQuestion(text, answers);
        } else {
            q = new MultipleChoiceQuestion(text, answers);
        }

        return q;
    }

    public void getResults() {
        System.out.println(q.getSubmittedAnswers());
    }
}
