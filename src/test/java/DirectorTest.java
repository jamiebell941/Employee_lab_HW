import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Fitchy", "ER108726N", 32000, "Admin", 19000.00);
    }


    @Test
    public void canGetBudget(){
        assertEquals(19000.00, director.getBudget(), 0.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Fitchy", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("ER108726N", director.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(32000, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.02);
        assertEquals(32640, director.getSalary());
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(640, director.calculatePayBonus(), 0.01);
    }
}
