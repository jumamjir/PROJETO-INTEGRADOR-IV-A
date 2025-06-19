import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(10, calc.somar(7, 3));
        assertEquals(-2, calc.somar(-5, 3));
        assertEquals(0, calc.somar(0, 0));
    }

    @Test
    void testSubtrair() {
        assertEquals(4, calc.subtrair(7, 3));
        assertEquals(-8, calc.subtrair(-5, 3));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(21, calc.multiplicar(7, 3));
        assertEquals(-15, calc.multiplicar(-5, 3));
        assertEquals(0, calc.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-6, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
