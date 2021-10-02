package step7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {
    public String message = "Saurabh";

    JUnitMessage junitMessage = new JUnitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJUnitMessage(){

        System.out.println("Junit Message is printing ");
        junitMessage.printMessage();

    }

    @Test
    public void testJUnitHiMessage(){
        message="Hi!" + message;
        System.out.println("Junit Message is printing ");
        assertEquals(message, junitMessage.printHiMessage());

    }

}
