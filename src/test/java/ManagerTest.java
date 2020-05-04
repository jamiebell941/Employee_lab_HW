import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Chris", "PE202020P", 30000, "Admin");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Admin", manager.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Chris", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("PE202020P", manager.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.02);
        assertEquals(30600, manager.getSalary());
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(300, manager.calculatePayBonus(), 0.01);
    }
}
