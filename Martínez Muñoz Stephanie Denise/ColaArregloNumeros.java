
import java.util.LinkedList;//Librería LinkedList
import java.util.Queue;//Librería Queue

class ColaArregloNumeros {//Declaración de la clase ColaArreglosNumeros

    public static void main(String[] args) {//Método main
        Queue<Integer> cola = new LinkedList<>();//Creación del la cola 
        int[] numeros = {1, 2, 3, 4, 5};//Declaración de arreglo de tipo entero
        for (int i = 0; i <= numeros.length - 1; i++) {//Creación del bucle for
            cola.add(numeros[i]);//Se agregan los números del arreglo a la cola
        }
        cola.add(6);//Se agregan elementos
        cola.add(7);//Se agregan elementos
        System.out.println(cola.peek());//Se muestra el primer elemrnto de la cola
        cola.remove();//Se elimina el primer elemento de la cola

        System.out.println(cola);//Se muestra la cola en pantalla
        System.out.println(cola.isEmpty());//Retorna true o false si la cola esta vacia o no
    }//Llave que cierra el main
}//Llave que cierra la calse
