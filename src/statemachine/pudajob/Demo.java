package statemachine.pudajob;

import static com.kursk.Util.getLine;
import static com.kursk.Util.println;

public class Demo {
    public static void main(String[] args) {
        PUDAJobProcess job = new PUDAJobProcess(0);
        println("press ENTER");
/*        getLine();*/
        job.handleBreakdown();
/*        getLine();*/
        job.handleBreakdownSuccess();
/*        getLine();*/
        job.handleExecuting();


/*        getLine();
        job.handleExecuteSuccess();*/
    }
}
