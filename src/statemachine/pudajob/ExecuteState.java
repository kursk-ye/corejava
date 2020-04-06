package statemachine.pudajob;

import static com.kursk.Util.println;

public class ExecuteState implements State {
    private String statename = "ExecuteState";

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
        println("任务执行成功");
        // coding 任务执行成功的后台业务代码
        job.setState(new SuccessState());
        println("任务转变为 SuccessState");
    }

    @Override
    public void executeFail(PUDAJobProcess job) {
        println("任务执行失败");
        // coding 任务执行失败的后台业务代码
        job.setState(new FailState());
        println("任务转变为 FailState");
    }

    @Override
    public void executing(PUDAJobProcess job) {
        println("任务执行中");
        // coding 任务中的后台业务代码
        int result = JobExecuteResult.getJobExecuteResult();
        switch(result) {
            case 0:
                this.executeSuccess(job);
                break;
            case 1:
                this.executeFail(job);
                break;
            case 2:
                job.setState(new ExecuteState());
                println("任务再次为 ExecuteState");
                this.executing(job);
                break;
            default:
                // code block
        }
    }
}
