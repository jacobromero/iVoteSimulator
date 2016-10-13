import java.util.Random;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class Student {
    private String id;

    public Student() {
        Random r = new Random();
        id = Integer.toString(r.nextInt(Integer.MAX_VALUE));
    }

    public void submitAnswer(Question question, String... answers) {
        question.submit(this.id, answers);
    }

    public String toString() {
        return id;
    }
}
