package griffith; 

import static org.junit.Assert.*;
import org.junit.Test;

public class ConversionsTest {

    @Test
    public void testEuroToDollar() {
        Conversions converter = new Conversions();
        assertEquals(1.18, converter.euroToDollar(1), 0.01); // 1 Euro = 1.18 Dollars
        assertEquals(11.8, converter.euroToDollar(10), 0.01); // 10 Euro = 11.8 Dollars
        assertEquals(0.0, converter.euroToDollar(0), 0.01); // 0 Euro = 0 Dollars
    }
}