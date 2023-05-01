package composite;

public abstract class Employee implements Prevlige {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  };
  public double getSalary(){
    return this.salary;
  };

  public void print() {
    System.out.println("Name ="+getName());
    System.out.println("Salary ="+getSalary());
  }




}

