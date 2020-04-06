package statemachine.fan;

import static com.kursk.Util.println;

public class Low implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setCurrentState(new Medium());

        println("do Medium speed");
    }
}
