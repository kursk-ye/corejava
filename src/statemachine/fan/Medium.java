package statemachine.fan;

import static com.kursk.Util.println;

public class Medium implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setCurrentState(new High());

        println("do High speed");
    }
}
