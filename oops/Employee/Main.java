package oops.Employee;


class Employee{
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public double getSalary(){
        return baseSalary;
    }


    public double calculateSalary(){
        return baseSalary;
    }
}

class Developer extends Employee{
    private double bonus=10000;
    public Developer(String name, double baseSalary){
        super(name,baseSalary);
    }
    @Override
    public double calculateSalary(){
        return getSalary()+bonus;
    } 
}

class Manager extends Employee{
    private double bonus=20000;
    public Manager(String name, double baseSalary){
        super(name,baseSalary);
    }
    @Override
    public double calculateSalary(){
        return getSalary()+bonus;
    } 
}

public class Main {
    public static void main(String[]args){
        Employee manager=new Manager("Hardhik", 60000);
        Employee developer=new Developer("Madhura", 50000);

        System.out.println("Total Salary of Manger: "+manager.calculateSalary());
        System.out.println("Total Salary of Devloper: "+developer.calculateSalary());
    }
    
}
