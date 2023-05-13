/* Reto del curso gratuito de Udemy https://www.udemy.com/course/curso-resolver-ejercicios-reales-de-entrevistas-tecnicas-programador/
Construye una función que le pases por parámetro un número y te haga un cuadrado con asceriscos. Ejemplo:
cuadrado(4)
****
*  *
*  *
****
 */
public class Main {


    public static void cuadrado(int num) {
        // Bucle que recorre 4 veces para hacer las 4 filas
        for (int j = 0; j < 4; j++) {
            // Si es la primera o la última fila, imprime num asteriscos
            if (j == 0 || j == 3) {
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println();
            // Si no, imprime un asterisco, num - 2 espacios y otro asterisco
            } else {
                System.out.print("*");
                for (int i = 0; i < num - 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }


    public static void main(String[] args) {
        cuadrado(5);
    }
}