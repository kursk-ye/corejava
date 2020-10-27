package statemachine.watermark;

public class emitMAXTSState implements AssignWMState{
    @Override
    public void change(StreamContext context) {
         System.out.println("current emitMAXTSState");
        context.setCurrentState(new emitMINTSState());
    }
}
