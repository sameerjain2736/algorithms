import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main (String[] args) {
        String champion = "";
        int index = 0;
        while(!StdIn.isEmpty()) {
            index++;
            String curr = StdIn.readString();
            if (StdRandom.bernoulli((double)1/index))
                champion = curr; 
        }
        System.out.println(champion);
    }
}