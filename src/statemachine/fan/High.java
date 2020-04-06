package statemachine.fan;

import static com.kursk.Util.println;

class High implements State {

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setCurrentState(new Off());

        println("off fan");
    }
}
