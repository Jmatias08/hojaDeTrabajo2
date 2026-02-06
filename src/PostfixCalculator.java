/**
 * Calculadora para evaluar expresiones en notación Postfix.
 * Implementa el ADT Calculator y utiliza una pila para la evaluación.
 */
public class PostfixCalculator implements Calculator {

    private Stack<Integer> stack;

    /**
     * Constructor de la calculadora postfix.
     *
     * @param stack pila utilizada para la evaluación
     */
    public PostfixCalculator(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División entre cero");
        }
        return a / b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Evalúa una expresión en notación postfix.
     *
     * Precondición: la expresión debe estar en formato postfix válido.
     * Postcondición: retorna el resultado de la expresión.
     *
     * @param expression expresión postfix
     * @return resultado entero
     * @throws Exception si la expresión es inválida
     */
    public int evaluate(String expression) throws Exception {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (token.matches("\\d")) {
                stack.push(Integer.parseInt(token));
            } else {
                if (stack.size() < 2) {
                    throw new Exception("Operandos insuficientes");
                }

                int b = stack.pop();
                int a = stack.pop();
                int result;

                switch (token) {
                    case "+":
                        result = sumar(a, b);
                        break;
                    case "-":
                        result = restar(a, b);
                        break;
                    case "*":
                        result = multiplicar(a, b);
                        break;
                    case "/":
                        result = dividir(a, b);
                        break;
                    default:
                        throw new Exception("Operador inválido: " + token);
                }

                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Expresión postfix inválida");
        }

        return stack.pop();
    }
}
