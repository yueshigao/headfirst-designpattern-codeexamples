package J_compositepattern.kataevaluator;

public class Value extends Component{

    Double value;

    public Value(Double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return value;
    }
}
