import java.util.Random;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class Student {
    private String id;
    private String name;

    public Student(String stuName) {
        Random r = new Random();
        id = Integer.toString(r.nextInt(Integer.MAX_VALUE));
        name = stuName;
    }

    public void submitAnswer(Question question, String... answers) {
        question.submit(this.id, answers);
    }

    public String toString() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
