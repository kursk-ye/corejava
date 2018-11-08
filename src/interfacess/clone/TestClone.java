package interfacess.clone;

import generic.fruits.Fruit;

import static com.kursk.Util.println;

public class TestClone {

    public static void main(String[] args)
    {
        try
        {
            Employee original = new Employee("kursk . ye", 100000000);
            original.setHireDay(2005,4,6);
            Employee copy = original.clone();
            copy.raiseSalary(200);
            copy.setHireDay(2020,3,1);
            println("original=" + original);
            println("copy=" + copy);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
