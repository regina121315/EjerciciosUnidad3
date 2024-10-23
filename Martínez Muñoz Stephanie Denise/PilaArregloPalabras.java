
import java.util.Stack;//Librería Pila

class PilaArregloPalabras {//Declaración de la clase PilaArreglosPalabras

    public static void main(String[] args) {//Método main
        Stack<String> pila = new Stack<>();//Creación del la pila 
        String[] palabras = {"flor", "árbol", "banco", "almohada", "lápiz"};//Declaración de arreglo de tipo String
        for (int i = 0; i <= palabras.length - 1; i++) {//Creación del bucle for
            pila.add(palabras[i]);//Se agregan las palabras del arreglo a la pila
        }
        pila.push("Mariana");//Se agregan elementos
        pila.push("Emanuel");//Se agregan elementos
        System.out.println(pila.peek());//Se muestra el último elemrnto de la pila
        pila.pop();//Se elimina el último elemento de la pila

        System.out.println(pila);//Se muestra la pila en pantalla
        System.out.println(pila.isEmpty());//Retorna true o false si la pila esta vacia o no
    }//Llave que cierra el main
}//Llave que cierra la calse
