import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void checkVolume(){
        assertEquals(100, waterBottle.checkVolume());
    }

    @Test
    public void takeDrink(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }
}
