package concurrency.synch2;

import java.util.Arrays;

import static com.kursk.Util.printf;
import static com.kursk.Util.println;

public class Bank2 {
    private final double[] accounts;

    public Bank2(int n , double initalBalance)
    {
        accounts = new double[n];
        Arrays.fill(accounts ,  initalBalance);
    }

    public synchronized void transfer(int from , int to , double amount ) throws InterruptedException
    {
        while (accounts[from] < amount)
            wait();
        println(Thread.currentThread());
        accounts[from] -= amount;
        printf(" %10.2f from %d to %d" , amount , from , to);
        accounts[to] += amount;
        printf("Total Balance : %10.2f%n" , getTotalBalance());
        notifyAll();
    }

    public synchronized double getTotalBalance()
    {
        double sum = 0;
        for(double a : accounts)
            sum += a;
        return  sum;
    }

    public int size()
    {
        return accounts.length;
    }

}
