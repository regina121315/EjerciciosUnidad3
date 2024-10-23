
import java.util.Stack;//Librería Stack

class PilaParEImpar {//Declaración de la clase PilaParEImpar

    public static void main(String[] args) {//Método main
        Stack<Integer> pilaPar = new Stack<>();//Creación de la pila par
        Stack<Integer> pilaImpar = new Stack<>();// Creación de la pila impar
        for (int i = 1; i <= 30; i++) {//Se realiza la iteración de los números
            if (i % 2 == 0) {//Se valida si los número son pares o impares
                pilaPar.push(i);//Si es par se agrega a la pila par
            } else {//Condición si no se cumple el If
                pilaImpar.push(i);//Si no es par se agrega a la pila impar
            }//Llave que cierra la condición else
        }//Llave que cierra el bucle for
    }//Llave que cierra el método main
}//Llave que cierra la clase
