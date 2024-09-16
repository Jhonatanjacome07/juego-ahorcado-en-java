import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase Secanner que nos permite que el usuario ingrese los datos
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                       //Esto se usa cuando hay una palabra de chars
            System.out.println("Palabra a advinar: " + String.valueOf(letrasAdivinadas)+ " "+ palabraSecreta.length()+ "letras");

            System.out.println("Introduce una letra, por favor");
            //char letra = scanner.next().charAt(0);
            //De esta forma hacemos para que las letras ingresadas sean todas en minusculas
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            

            boolean letraCorrecta = false;
            // Estructura de control: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control: Condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            //Estructura de control: Condicional
            if (!letraCorrecta) {
                intentos++;
                System.err.println("Incorrecto!!! Te quedan " + (intentosMaximos - intentos) + "intentos");
            }

            //Estructura de control: Condicional
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidaes, Has adivinado la palabra seceerta: " + palabraSecreta);
            }
        }

        //Estructura de control: Condicional
        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos! GAME OVER");
        }

        //Cerramos el scanner para que no se quede esperando un ingreso de mas datos por parte del usuario
        scanner.close();

    }
}
