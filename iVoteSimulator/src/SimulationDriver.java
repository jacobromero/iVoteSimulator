/**
 * Created by Jacob Romero on 10/11/2016.
 */
public class SimulationDriver {
    public static void main(String[] args) {
        IVoteService ivs = new IVoteService();
        Question question1 = ivs.createQuestion("Enter yes or no", "a", "b", "c");
//        Question question1 = ivs.createQuestion("Enter yes or no", "yes", "no");
        System.out.println(question1);

        Student s = new Student();
        Student s2 = new Student();
        s.submitAnswer(question1, "a", "b", "c");
//        s.submitAnswer(question1, "yes");
        s2.submitAnswer(question1, "a", "b");
//        s2.submitAnswer(question1, "no");

        ivs.getRawResults(question1);
        ivs.getAggregateResults(question1);
    }
}
