package chair;

import chair.AbstractChairFactory;
import chair.FunctionalChair;
import chair.MagicChair;
import chair.VictorianChair;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(200);
    }

    @Override
    public MagicChair createMagicChair() {
        return null;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return null;
    }
}
