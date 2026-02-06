import java.util.Vector;

/**
 * Implementación de la interfaz Stack usando un Vector dinámico.
 *
 * @param <T> Tipo de elementos almacenados
 */
public class VectorStack<T> implements Stack<T> {

    private Vector<T> data;

    /**
     * Constructor que inicializa la pila vacía.
     */
    public VectorStack() {
        data = new Vector<>();
    }

    /**
     * Inserta un elemento en la pila.
     *
     * @param item elemento a insertar
     */
    @Override
    public void push(T item) {
        data.add(item);
    }

    /**
     * Elimina y retorna el elemento superior de la pila.
     *
     * @return elemento superior
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return data.remove(data.size() - 1);
    }

    /**
     * Retorna el elemento superior sin eliminarlo.
     *
     * @return elemento superior
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return data.lastElement();
    }

    /**
     * Indica si la pila está vacía.
     *
     * @return true si está vacía, false si contiene elementos
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Retorna la cantidad de elementos almacenados.
     *
     * @return tamaño de la pila
     */
    @Override
    public int size() {
        return data.size();
    }
}
