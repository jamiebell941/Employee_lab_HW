import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("John", "PA203989B", 24000);
    }

    @Test
    public void hasName(){
        assertEquals("John", employee.getName());
    }

    @Test
    public void canSetName() {
        employee.setName("Dave");
        assertEquals("Dave", employee.getName());}

    @Test
    public void cantSetName() {
        employee.setName(null);
        assertEquals("John", employee.getName());}

    @Test
    public void hasNI(){
        assertEquals("PA203989B", employee.getNI());
    }

    @Test
    public void canSetNI(){
        employee.setNI("AS123456B");
        assertEquals("AS123456B", employee.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000, employee.getSalary());
    }

    @Test
    public void canSetSalary(){
        employee.setSalary(40000);
        assertEquals(40000, employee.getSalary());
    }

    @Test
    public void canIncreaseSalary(){
        employee.raiseSalary(0.02);
        assertEquals(24480, employee.getSalary());
    }

    @Test
    public void cantIncreaseSalary(){
        assertEquals(24000, employee.getSalary());
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(240.0, employee.calculatePayBonus(), 0.01);
    }
}
