import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpeedingTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void caughtSpeeding() throws Exception {
        assertTrue(Speeding.caughtSpeeding(60, true)==-2);
    }

}