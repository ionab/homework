import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before(){
        testCalculator = new Calculator(12, 2);
    }

    @Test
    public void canAdd(){
        assertEquals(14, testCalculator.add());
    }
    @Test
    public void canSubtract(){
        assertEquals(10, testCalculator.subtract());
    }
    @Test
    public void canMultiply(){
        assertEquals(24, testCalculator.multiply());
    }
    @Test
    public void canDivide(){
        assertEquals(6, testCalculator.divide());
    }
}
