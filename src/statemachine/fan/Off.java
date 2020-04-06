package statemachine.fan;

import static com.kursk.Util.println;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setCurrentState(new Low());

        println("do Low speed");
    }
}
