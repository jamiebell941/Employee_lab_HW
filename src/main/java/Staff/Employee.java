package Staff;

public class Employee {

    private String name;
    private String NI;
    private int salary;

    public Employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            return;
        this.name = name;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increaseAmount){

       int newSalary = this.salary += this.salary * increaseAmount;
       if (increaseAmount > 0.00)
       this.setSalary(newSalary);
       else if (increaseAmount <= 0.00 )
        return ;

    }

    public double calculatePayBonus() {
        double bonus = this.salary / 100;
        return bonus;
    }
}
