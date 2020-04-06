package statemachine.pudajob;

import static com.kursk.Util.println;

public class InitState implements State {
    private String statename = "InitState";

    @Override
    public void breakdown(PUDAJobProcess job) {
        println("对任务进行分解");
        job.setState(new BreakdownState());
        println("任务转变为BreakdownState");
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
