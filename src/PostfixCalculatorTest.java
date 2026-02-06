import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Pruebas unitarias para la calculadora postfix.
 */
public class PostfixCalculatorTest {

    /**
     * Prueba de evaluación correcta.
     */
    @Test
    public void testEvaluate() throws Exception {
        Stack<Integer> stack = new VectorStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack);
        assertEquals(15, calc.evaluate("1 2 + 4 * 3 +"));
    }

    /**
     * Prueba de división entre cero.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() throws Exception {
        Stack<Integer> stack = new VectorStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack);
        calc.evaluate("4 0 /");
    }
}