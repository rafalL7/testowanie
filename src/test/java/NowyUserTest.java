import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NowyUserTest {

    @Test
    public void testInit(){
        NowyUser user = new NowyUser();
        user.setName("Rafał Sarnecki");
        String name;
        name = user.getName();
        System.out.println(name);
    }

    @Before
    public void setUp() {
        this.testInit();
    }

    @After
    public void tearDown() {
       System.out.println("It works");
    }
}