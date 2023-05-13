import java.util.Arrays;

// Función que devuelva true si es palíndromo y false si no lo es
public class Main {

    public static void palindromo(String palindromo){
        String palindromoSplit1 = null;
        String palindromoSplit2 = null;
        boolean palindromoB = true;

        if(palindromo.length() % 2 == 0){
            // Dividir el string en dos y guardarlo en dos variables
            palindromoSplit1 = palindromo.substring(0, palindromo.length()/2);
            palindromoSplit2 = palindromo.substring(palindromo.length()/2);
            for(int i=0;i<palindromoSplit1.length();i++){
                if (palindromoSplit1.charAt(i) != palindromoSplit2.charAt(palindromoSplit2.length()-1-i)) {
                    palindromoB = false;
                    break;
                }
            }
        } else {
            // Dividir el string en dos y guardarlo en dos variables
            palindromoSplit1 = palindromo.substring(0, palindromo.length()/2);
            palindromoSplit2 = palindromo.substring(palindromo.length()/2+1);
            for(int i=0;i<palindromoSplit1.length();i++){
                if (palindromoSplit1.charAt(i) != palindromoSplit2.charAt(palindromoSplit2.length()-1-i)) {
                    palindromoB = false;
                    break;
                }
            }

        }
        if(palindromoB){
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    public static void main(String[] args) {
        palindromo("reconocer");
    }
}