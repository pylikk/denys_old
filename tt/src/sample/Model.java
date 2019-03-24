package sample;

/**
 * Created by Ьф on 14.06.2017.
 */
public class Model {

    public double calculate (double buffer, String operator, double current) {

        if (operator.equals("+")) {
            return buffer + current;
        }
        else if (operator.equals("-")) {
            return buffer - current;
        }
        else if (operator.equals("*")) {
            return buffer * current;
        }
        else if (operator.equals("/")) {
            return buffer / current;
        }
        else if (operator.equals("=")) {
            return buffer / current;
        }
        else return 0;
    }
}
