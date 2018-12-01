package generic;

public class Employee implements Comparable<Employee> {
    String name;
    int bonuse;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name , int bonuse){
        this.name = name;
        this.bonuse = bonuse;
    }

    public String getName(){
        return this.name + " (employee)";
    }

    public int getBonus(){
        return this.bonuse;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

class Manager extends Employee{

    Manager(String name){
        super(name);
    }

    Manager(String name, int bonus){
        super(name, bonus);
    }

    public String getName(){
        return this.name + " (manager)";
    }

    public int getBonus(){
        return this.bonuse;
    }
}
