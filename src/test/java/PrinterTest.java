import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }

    @Test
    public void hasSheets(){
        assertEquals(10, printer.hasSheets());
    }

    @Test
    public void print(){
        assertEquals(true, printer.print());
    }

    @Test
    public void reduceSheets(){
        assertEquals(4, printer.reduceSheets());
    }
}


