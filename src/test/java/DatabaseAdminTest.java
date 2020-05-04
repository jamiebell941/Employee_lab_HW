import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("James", "QT901293B", 27000);
    }

    @Test
    public void canGetName(){
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("QT901293B", databaseAdmin.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(27000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.02);
        assertEquals(27540, databaseAdmin.getSalary());
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(270, databaseAdmin.calculatePayBonus(), 0.01);
    }
}
