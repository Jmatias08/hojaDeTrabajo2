import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Pruebas unitarias para la clase VectorStack.
 */
public class VectorStackTest {

    /**
     * Prueba del método push y pop.
     */
    @Test
    public void testPushPop() {
        Stack<Integer> stack = new VectorStack<>();
        stack.push(10);
        assertEquals(10, (int) stack.pop());
    }

    /**
     * Prueba del método isEmpty.
     */
    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new VectorStack<>();
        assertTrue(stack.isEmpty());
    }
}
