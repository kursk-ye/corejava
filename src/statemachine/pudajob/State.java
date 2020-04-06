package statemachine.pudajob;

public interface State {
    public void breakdown(PUDAJobProcess job);
    public void breakdownSuccess(PUDAJobProcess job);
    public void breakdownFail(PUDAJobProcess job);
    public void executeSuccess(PUDAJobProcess job);
    public void executeFail(PUDAJobProcess job);
    public void executing(PUDAJobProcess job);
}
