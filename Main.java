import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase principal del programa.
 * Lee expresiones postfix desde un archivo y muestra el resultado.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        try {
            Stack<Integer> stack = new VectorStack<>();
            PostfixCalculator calculator = new PostfixCalculator(stack);

            BufferedReader br = new BufferedReader(
                    new FileReader("resource/datos.txt")
            );

            String line;
            while ((line = br.readLine()) != null) {
                int result = calculator.evaluate(line);
                System.out.println("Resultado: " + result);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}