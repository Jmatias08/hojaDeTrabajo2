/**
 * ADT Calculadora.
 * Define las operaciones aritméticas básicas.
 */
public interface Calculator {

    /**
     * Suma dos enteros.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de a + b
     */
    int sumar(int a, int b);

    /**
     * Multiplica dos enteros.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de a * b
     */
    int multiplicar(int a, int b);

    /**
     * Divide dos enteros.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado de a / b
     * @throws ArithmeticException si b es cero
     */
    int dividir(int a, int b);

    /**
     * Resta dos enteros.
     *
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de a - b
     */
    int restar(int a, int b);
}