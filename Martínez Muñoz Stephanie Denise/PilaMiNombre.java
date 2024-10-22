
import java.util.Stack;//Librería Stack

class PilaMiNombre {//Declaración de la calse PilaMiNombre

    public static void main(String[] args) {//Método main
        Stack<Character> pilas = new Stack<>();//Creación de la pila de tipo caracter
        System.out.println(pilas.isEmpty());//Retorno de true o flase
        pilas.push('S');//Se agregan datos a la pila
        pilas.push('t');//Se agregan datos a la pila
        pilas.push('e');//Se agregan datos a la pila
        pilas.push('p');//Se agregan datos a la pila
        pilas.push('h');//Se agregan datos a la pila
        pilas.push('a');//Se agregan datos a la pila
        pilas.push('n');//Se agregan datos a la pila
        pilas.push('i');//Se agregan datos a la pila
        pilas.push('e');//Se agregan datos a la pila
        System.out.println(pilas.peek());//Muestra el último dato en pantalla
        pilas.push('D');//Se agregan datos a la pila
        pilas.push('e');//Se agregan datos a la pila
        pilas.push('n');//Se agregan datos a la pila
        pilas.push('i');//Se agregan datos a la pila
        pilas.push('s');//Se agregan datos a la pila
        System.out.println(pilas.search('e'));//Busca y muestra el valor del dato en pantalla
        pilas.push('M');//Se agregan datos a la pila
        pilas.push('a');//Se agregan datos a la pila
        pilas.push('r');//Se agregan datos a la pila
        pilas.push('t');//Se agregan datos a la pila
        pilas.push('í');//Se agregan datos a la pila
        pilas.push('n');//Se agregan datos a la pila
        pilas.push('e');//Se agregan datos a la pila
        pilas.push('z');//Se agregan datos a la pila
        pilas.pop();//Elimina elementos de la pila
        pilas.pop();//Elimina elementos de la pila
        System.out.println(pilas);//Muestra la pila en pantalla
        pilas.push('M');//Se agregan datos a la pila
        pilas.push('u');//Se agregan datos a la pila
        pilas.push('ñ');//Se agregan datos a la pila
        pilas.push('o');//Se agregan datos a la pila
        pilas.push('z');//Se agregan datos a la pila
        for (Character pilita : pilas) {//Bucle for Each para iterar la pila
            System.out.println(pilita);//Muestra en pantalla la iteración de la pila
        }//Cierra el bucle forEach

    }//Llave que cierra el método main
}//Llave que cierra la clase 
