import org.junit.Before;
import management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "jp102030a", 30000, "Finance");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }
}
