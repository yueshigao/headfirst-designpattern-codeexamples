package J_compositepattern.kataevaluator;

import java.util.Arrays;
import java.util.List;

public class CalculatorAPP {

    // (3+2)*4
    public static void main(String[] args) {

        Component value1 = new Value(3.0);
        Component value2 = new Value(2.0);
        Component value3 = new Value(4.0);

        List<Double> valuesToAdd = Arrays.asList(3.0,2.0);



    }
}
