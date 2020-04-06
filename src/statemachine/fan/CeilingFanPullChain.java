package statemachine.fan;

public class CeilingFanPullChain {
    private State currentState;

    public CeilingFanPullChain(){
        currentState = new Off();
    }

    public void setCurrentState(State s){
        this.currentState = s;
    }

    public void pull(){
        currentState.pull(this);
    }
}
