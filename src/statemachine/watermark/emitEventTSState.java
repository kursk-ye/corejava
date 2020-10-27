package statemachine.watermark;

public class emitEventTSState  implements AssignWMState{
    @Override
    public void change(StreamContext context) {
        System.out.println("current emitEventTSState");
        context.setCurrentState(new emitMAXTSState());
    }
}
