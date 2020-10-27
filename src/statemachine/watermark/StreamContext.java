package statemachine.watermark;

import statemachine.fan.State;

public class StreamContext {
  private AssignWMState state = new emitMINTSState();

  void setCurrentState(AssignWMState s) {
    this.state = s;
  }

  public void nextState() {
    state.change(this);
  }
}
