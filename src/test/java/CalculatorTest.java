import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator testCalculator;

    @Before
    public void before(){
        testCalculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(14, testCalculator.add(12, 2));
    }
    @Test
    public void canSubtract(){
        assertEquals(10, testCalculator.subtract(12, 2));
    }
    @Test
    public void canMultiply(){
        assertEquals(24, testCalculator.multiply(12, 2));
    }
    @Test
    public void canDivide(){
        assertEquals(6, testCalculator.divide(12, 2), 0.1);
    }
}
