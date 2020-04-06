package statemachine.pudajob;

import static com.kursk.Util.println;

public class SuccessState implements State {
    private String statename = "SuccessState";

    @Override
    public void breakdown(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void breakdownSuccess(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void breakdownFail(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void executeSuccess(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void executeFail(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void executing(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }
}
