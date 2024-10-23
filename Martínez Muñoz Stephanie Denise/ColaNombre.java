
import java.util.LinkedList;//Librería LinkedList
import java.util.Queue;//Librería Queue

class ColaNombre {//Declaración de la clase ColaNombre

    public static void main(String[] args) {//Método main
        Queue<Character> cola = new LinkedList<>();//Creación del la cola 
        String name = "Yael";//Declaración de la variable name de tipo String
        for (int i = 0; i <= name.length(); i++) {//Creación del bucle for
            char letra = name.charAt(i);/*Se convierte la variable name de String a char y se almacena en la variable letra*/
            cola.add(letra);//Se agrega la variable letra a la cola
        }
        System.out.println(cola);//Se muestra la cola en pantalla
    }//Llave que cierra el main
}//Llave que cierra la calse
