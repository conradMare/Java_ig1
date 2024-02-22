package examples.ReviewExamples.com.example;

/**
 * @author anshenoy
 */
public class PassByValue {

    void callByValue(int x) {
        x = 100;
    }

    public static void main(String args[]) {
        int x = 50;
        PassByValue pv = new PassByValue();
        pv.callByValue(x);
        System.out.println(x);

    }
}
