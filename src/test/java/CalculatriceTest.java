import static org.junit.Assert.*;

import org.example.Calculatrice;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAddition(){
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.addition(2, 3));
    }
    @Test
    public void testSoustraction(){
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.soustraction(3, 2));

    }
}
