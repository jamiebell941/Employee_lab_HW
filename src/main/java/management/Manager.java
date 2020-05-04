package management;

public class Manager extends Staff.Employee {

    private String deptName;

    public Manager(String name, String NI, int salary, String deptName) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
