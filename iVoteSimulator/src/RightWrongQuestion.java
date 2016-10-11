/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class RightWrongQuestion implements Question {
    private String questionText;

    public  RightWrongQuestion(String text) {
        questionText = text;
    }

    public void submit(String text) {

    }

    public String getQuestionText() {
        return questionText;
    }
}
