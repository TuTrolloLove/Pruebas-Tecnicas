import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testRomano(){
        Main m = new Main();
        int resultado = m.romanoDecimal("VVV");
        assertEquals(15, resultado);
    }
    @Test
    public void testRomano2(){
        Main m = new Main();
        int resultado = m.romanoDecimal("MDCXLVI");
        assertEquals(1646, resultado);
    }

}
