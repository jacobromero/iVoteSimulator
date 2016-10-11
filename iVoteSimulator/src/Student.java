import java.util.Random;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class Student {
    private String id;

    public Student() {
        Random r = new Random();
        id = Integer.toString(r.nextInt());
    }

    public void submitAnwer(String answer, Question question) {
        question.submit(answer);
    }

    public String toString() {
        return id;
    }
}
