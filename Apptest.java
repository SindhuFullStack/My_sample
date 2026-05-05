package cse_sjc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Apptest {
	@Test
    public void testlogin_invalid() {
        App myapp = new App();
        assertEquals(0, myapp.userLogin("abc", "abc@123"));
    }

    @Test
    public void testlogin_valid() {
        App myapp = new App();
        assertEquals(1, myapp.userLogin("abc", "abc0123"));
    }
}