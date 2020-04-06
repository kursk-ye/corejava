package statemachine.fan;

public interface State {
    void pull(CeilingFanPullChain wrapper);
}
