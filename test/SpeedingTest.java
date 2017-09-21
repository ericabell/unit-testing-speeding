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
        assertTrue(Speeding.caughtSpeeding(55, false)==0);
        assertTrue(Speeding.caughtSpeeding(65, false)==1);
        assertTrue(Speeding.caughtSpeeding(81, false)==2);
        assertTrue(Speeding.caughtSpeeding(90, true)==0);
    }

}