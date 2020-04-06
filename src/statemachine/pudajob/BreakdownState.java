package statemachine.pudajob;

import static com.kursk.Util.println;

public class BreakdownState implements State {
    private String statename = "BreakdownState";

    @Override
    public void breakdown(PUDAJobProcess job) {
        println( this.statename + "状态不能执行该方法");
    }

    @Override
    public void breakdownSuccess(PUDAJobProcess job) {
        println("任务分解成功");
        // coding 任务分解成功的后台业务代码
        job.setState(new ExecuteState());
        println("任务转变为ExecuteState");
    }

    @Override
    public void breakdownFail(PUDAJobProcess job) {
        println("任务分解失败");
        // coding 任务分解失败的后台业务代码
        job.setState(new FailState());
        println("任务转变为FailState");
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
