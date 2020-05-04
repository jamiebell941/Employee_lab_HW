import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tim", "AS123456B", 26000);
    }

    @Test
    public void canGetName(){
        assertEquals("Tim", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("AS123456B", developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.02);
        assertEquals(26520, developer.getSalary());
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(260, developer.calculatePayBonus(), 0.01);
    }
}
