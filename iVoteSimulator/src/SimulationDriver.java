/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class SimulationDriver {
    public static void main(String[] args) {
        IVoteService ivs = new IVoteService();
        Question question1 = ivs.createQuestion("Enter yes or no", "yes", "no");
        System.out.println(question1);

        Student s = new Student();
        s.submitAnswer("yes", question1);
        s.submitAnswer("no", question1);

        ivs.getResults();
    }
}
