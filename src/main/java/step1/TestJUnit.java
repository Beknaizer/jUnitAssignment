package step1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
    public void testSetup() {
        String str = "I am done with JUnit setup";
        assertEquals("I am done with JUnit setup", str);
    }
}
