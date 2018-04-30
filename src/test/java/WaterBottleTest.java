import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testWaterBottle;

    @Before
    public void before() {
        testWaterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, testWaterBottle.getVolume());
    }
    @Test
    public void drinkFunctionDepreciatesVolumeValueBy10(){
        assertEquals(90, testWaterBottle.drink());
    }
    @Test
    public void empty(){
        assertEquals(0, testWaterBottle.empty());
    }



}
