import org.junit.Assert;
import org.junit.Test;

public class TravisCITest extends Assert {
    @Test
    public void mathTestGood() {
        assertEquals(4,2+2);
    }

    @Test
    public void mathTestBad() {
        assertEquals(4,2+3);
    }
}
