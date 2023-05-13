// No es necesario los extremos de las rayas arriba de los números
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.romanoDecimal("XVICDLXVII".toUpperCase()));
    }

    public int romanoDecimal(String nRomano) {
        int nRomanoInt = 0;
        StringBuilder letrasSobrantes = new StringBuilder();
        for (int i = 0; i < nRomano.length(); i++) {
            switch (nRomano.charAt(i)) {
                case 'I' -> {
                    if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'V') {
                        nRomanoInt += 4;
                        i += 1;
                    } else if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'X') {
                        nRomanoInt += 9;
                        i += 1;
                    } else {
                        nRomanoInt += 1;
                    }
                }
                case 'V' -> nRomanoInt += 5;
                case 'X' -> {
                    if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'L') {
                        nRomanoInt += 40;
                        i += 1;
                    } else if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'C') {
                        nRomanoInt += 90;
                        i += 1;
                    } else {
                        nRomanoInt += 10;
                    }
                }
                case 'L' -> nRomanoInt += 50;
                case 'C' -> {
                    if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'D') {
                        nRomanoInt += 400;
                        i += 1;
                    } else if (i != nRomano.length()-1 && nRomano.charAt(i + 1) == 'M') {
                        nRomanoInt += 900;
                        i += 1;
                    } else {
                        nRomanoInt += 100;
                    }
                }
                case 'D' -> nRomanoInt += 500;
                case 'M' -> nRomanoInt += 1000;
                default -> {
                    letrasSobrantes.append(nRomano.charAt(i)).append(", ");
                    if(i == nRomano.length()-1){
                        System.out.println("Has introducido algún caracter no válido: " + letrasSobrantes);
                        System.exit(0);
                    }
                }
            }

        }
        return nRomanoInt;
    }
}
