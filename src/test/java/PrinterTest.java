import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer testPrinter;

    @Before
    public void before(){
        testPrinter = new Printer(100);
    }


    @Test
    public void hasPaper(){
        assertEquals(100, testPrinter.getPaper());
    }
}
