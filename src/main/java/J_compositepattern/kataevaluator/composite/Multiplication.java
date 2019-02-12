package J_compositepattern.kataevaluator.composite;

import J_compositepattern.kataevaluator.Component;

import java.util.List;

public class Multiplication extends BinaryOperation {

    public Multiplication(List values) {
        super(values);
    }

    @Override
    public Double evaluate() {
        return values.stream().reduce((a,b)->a*b).orElse(0.0);
    }
}
