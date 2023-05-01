package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager extends Employee  {


  List<Employee> employees = new ArrayList<Employee>();

  public Manager(String name,double salary){
    super(name,salary);
  }



  @Override
  public void add(Employee employee) {
    employees.add(employee);
  }
  @Override
  public void remove(Employee employee) {
    employees.remove(employee);
  }
  @Override
  public Employee getChild(int i) {
    return employees.get(i);
  }

  public void print() {
    System.out.println("Name ="+getName());
    System.out.println("Salary ="+getSalary()+"\n");

    Iterator<Employee> employeeIterator = employees.iterator();
    while(employeeIterator.hasNext()){
      Employee employee = employeeIterator.next();
      employee.print();
    }
  }
}

