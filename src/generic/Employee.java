package generic;

public class Employee {
    protected String name;
    protected int bonuse;

    Employee(String name){
        this.name = name;
    }

    Employee(String name , int bonuse){
        this.name = name;
        this.bonuse = bonuse;
    }

    public String getName(){
        return this.name + " (employee)";
    }

    public int getBonus(){
        return this.bonuse;
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
