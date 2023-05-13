import java.util.Arrays;

/* Reto propuesto por Victor Robles WEB en un vídeo de su canal de Youtube:
https://www.youtube.com/watch?v=2OlEhnqu1Gw
Reto 1 - Dificultad Intermedia
Crea una función a la cual le pase un array de números
y un numero que será el resultado de la suma de dos de los valores

Ejemplos:
sumarDos([3, 7, 8, 2], 10) // [3,7] (ambos suman 10)
sumarDos([4, 5, 9, 1], 10) // [9,1]
sumarDos([1, 2, 3, 4], 5) // [2,3]
 */
public class Main {
    public static int[] sumarDos(int[] numeros, int solucion){
        int[] nums = new int[2];
        for (int numero : numeros) {
            for (int j = 1; j < 4; j++) {
                if (numero + numeros[j] == solucion) {
                    if (numero != 2 && numeros[j] != 2) {
                        nums[0] = numero;
                        nums[1] = numeros[j];
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumarDos(new int[]{1, 2, 3, 4}, 4)));
        System.out.println(Arrays.toString(sumarDos(new int[]{3, 7, 1, 5}, 12)));
    }
    }

