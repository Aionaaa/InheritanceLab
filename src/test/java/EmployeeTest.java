import org.junit.Test;
import staff.Employee;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Test
    public void canGetName(){
        employee = new Manager("John", "jp102030a", 30000, "Finance");
        assertEquals("John", employee.getName());
    }

}
