package statemachine.pudajob;

import static com.kursk.Util.println;

public class PUDAJobProcess {
    State currentState;
    int id;

    public PUDAJobProcess(int id){
        this.currentState = new InitState();
        this.id = id;
    }

    public void setState(State s){
        this.currentState = s;
    }

    public State getState(){
        return this.currentState;
    }

    public void handleBreakdown(){
        println("job id:" + this.id);
        currentState.breakdown(this);
    }

    public void handleBreakdownSuccess(){
        println("job id:" + this.id);
        currentState.breakdownSuccess(this);
    }

    public void handleExecuteSuccess(){
        println("job id:" + this.id);
        currentState.executeSuccess(this);
    }

    public void handleExecuting(){
        println("job id:" + this.id);
        currentState.executing(this);
    }

}
