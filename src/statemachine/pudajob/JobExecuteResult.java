package statemachine.pudajob;

import java.util.Random;

public class JobExecuteResult {
    /*
     * 0 : success
     * 1 : fail
     * 2 : executing
     */
    public static int getJobExecuteResult(){
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int result = rand.nextInt(3);

        return result;
    }
}
