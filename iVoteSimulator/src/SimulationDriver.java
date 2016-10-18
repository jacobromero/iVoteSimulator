import java.util.ArrayList;

/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class SimulationDriver {
    public static void main(String[] args) {
        IVoteService ivs = new IVoteService();
        ArrayList<String> q1Ans = new ArrayList<String>();
        q1Ans.add("a");
        q1Ans.add("b");
        q1Ans.add("c");
        Question question1 = ivs.createQuestion("Select multiple answers; a, b, c: ", "a", "b", "c");

        ArrayList<String> q2Ans = new ArrayList<String>();
        q1Ans.add("yes");
        q1Ans.add("no");
        Question question2 = ivs.createQuestion("Enter yes or no: ", "yes", "no");

        // Print out questions
        System.out.println("Question 1 --- " + question1);
        System.out.println("Question 2 --- " + question2);

        Student s = new Student("Student 1");
        Student s2 = new Student("Student 2");
        ivs.addToRoster(s);
        ivs.addToRoster(s2);

        // Students submit answers
        s.submitAnswer(question1, "a", "b", "c");
        s.submitAnswer(question2, "yes");

        s2.submitAnswer(question1, "a", "b");
        s2.submitAnswer(question2, "no");


        System.out.println("\n\nResults for Question 1: ");
        ivs.getRawResults(question1);
        ivs.getAggregateResults(question1);

        System.out.println("\n\nResults for Question 2: ");
        ivs.getRawResults(question2);
        ivs.getAggregateResults(question2);
    }
}
