import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(15, 3);
    }

    @Test
    public void canAdd(){
        assertEquals(18, calculator.canAdd());
    }

    @Test
    public void canSubtract(){
        assertEquals(12, calculator.canSubtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(45, calculator.canMultiply());
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.canDivide(), 0.01);
    }
}
