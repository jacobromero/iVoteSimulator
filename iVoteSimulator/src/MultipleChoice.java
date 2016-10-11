/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class MultipleChoice implements Question {
    private String questionText;

    public MultipleChoice(String text) {
        questionText = text;
    }

    public void submit(String text) {

    }

    public String getQuestionText() {
        return questionText;
    }

}
