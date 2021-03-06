package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NI, int salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double calculatePayBonus() {
        return (this.getSalary() / 100) * 2;
    }
}
