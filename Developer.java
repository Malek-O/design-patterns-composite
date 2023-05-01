package composite;

public class Developer extends Employee  {

  public Developer(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void add(Employee employee) {

  }

  @Override
  public void remove(Employee employee) {

  }

  @Override
  public Employee getChild(int i) {
    return null;
  }
}