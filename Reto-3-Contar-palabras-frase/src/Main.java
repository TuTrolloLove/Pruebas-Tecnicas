/* Ejercicio del curso gratuito de Udemy https://www.udemy.com/course/curso-resolver-ejercicios-reales-de-entrevistas-tecnicas-programador/
Con un método, contar las veces que se repite la palabra que digas en la frase que digas, pasando esos dos datos por parámetros
 */
public class Main {
    // Método que cuenta las veces que se repite una palabra en una frase
    public static int repetir(String frase, String fraseRepetida){
        // Contador para sumar posiciones en el array
        int contador = 0;
        // Contador para sumar las veces que se repite la palabra
        int vecesRepite = 0;
        // Array para guardar las palabras de la frase
        String[] fraseArray = new String[frase.length()];
        // Quitamos las , de la frase
        frase = frase.replace(',', ' ');
        // Separamos la frase en palabras y las guardamos en el array
        for(int i=0;i<frase.length();i++){
            fraseArray = frase.split(" ");
            if(fraseArray[contador].matches("^[a-zA-Z]")){
                contador++;
            }
        }
        // Recorremos el array y comprobamos si la palabra se repite
            for (String s : fraseArray) {
                if(s.equals(fraseRepetida)){
                    vecesRepite++;
                }
            }

        return vecesRepite;

    }

    public static void main(String[] args) {
        System.out.println(repetir("Hola Paco Paquito Paco, hola paco paquito".toLowerCase(), "Hola".toLowerCase()));
    }
}