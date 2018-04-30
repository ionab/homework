import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before(){
        testCalculator = new Calculator(12, 10);
    }

    @Test
    public void canAdd(){
        assertEquals(22, testCalculator.add());
    }
}
