package statemachine.watermark;

public class emitMINTSState implements AssignWMState {
    @Override
    public void change(StreamContext context) {
    System.out.println("current emitMINTSState");
        context.setCurrentState(new emitEventTSState());
    }
}
