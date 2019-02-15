package M_compoundPattern.d_duckgoosefactory_abstractFactory;

import M_compoundPattern.a_quackable_strategy.Quackable;
import M_compoundPattern.b_goose_adapter.Goose;
import M_compoundPattern.b_goose_adapter.GooseAdapter;

public class GooseAdapterFactory implements AbstractGooseFactory {
    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
