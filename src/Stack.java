/**
 * ADT Pila genérica.
 * Define el comportamiento básico de una estructura tipo Stack (LIFO).
 *
 * @param <T> Tipo de elementos almacenados en la pila
 */
public interface Stack<T> {

    /**
     * Inserta un elemento en la parte superior de la pila.
     *
     * @param item elemento a insertar
     */
    void push(T item);

    /**
     * Elimina y retorna el elemento superior de la pila.
     *
     * @return elemento superior de la pila
     * @throws RuntimeException si la pila está vacía
     */
    T pop();

    /**
     * Retorna el elemento superior sin eliminarlo.
     *
     * @return elemento superior de la pila
     * @throws RuntimeException si la pila está vacía
     */
    T peek();

    /**
     * Indica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario
     */
    boolean isEmpty();

    /**
     * Retorna la cantidad de elementos en la pila.
     *
     * @return número de elementos en la pila
     */
    int size();
}
