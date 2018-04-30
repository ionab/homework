import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer testPrinter;

    @Before
    public void before(){
        testPrinter = new Printer(100, 100);
    }


    @Test
    public void hasPaper(){
        assertEquals(100, testPrinter.getPaper());
    }

    @Test
    public void printReducesPaperRequirementLessThanPaper(){
        testPrinter.print(10, 9);
        assertEquals(10, testPrinter.getPaper());
    }

    @Test
    public void printDoesNotReducePaperWhenRequirementTooHigh(){
        testPrinter.print(10,12);
        assertEquals(100, testPrinter.getPaper());
    }

    @Test
    public void refill(){
        testPrinter.refill(100);
        assertEquals(100, testPrinter.getPaper());
    }
    @Test
    public void hasVolume(){
        assertEquals(100, testPrinter.getVolume());
    }
    @Test
    public void printReducesTonerVolumeByOne(){
        testPrinter.print(10, 9);
        assertEquals(10, testPrinter.getVolume());
    }
}
