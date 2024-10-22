//Tipo de libreria
import java.util.Stack;
    //Nombre de la clase
    class Nombre{
        //Metodo main
        public static void main(String[] args) {
            //Declara las pilas
            Stack<Character>pila = new Stack<Character>();
            //Devuelve un valor si es verdadero o falso
            System.out.println(pila.isEmpty());
            //Mete un elemento a la pila
            pila.push('E');
            pila.push('M');
            pila.push('A');
            pila.push('N');
            pila.push('U');
            pila.push('E');
            pila.push('L');
            //Nos dice el ultimo elemento en la pila
            System.out.println(pila.peek());
            //Mete un elemento a la pila
            pila.push('E');
            pila.push('N');
            pila.push('R');
            pila.push('I');
            pila.push('Q');
            pila.push('U');
            pila.push('E');
            pila.push('Z');
            //Busca todos los elementos en la pila
            System.out.println(pila.search('E'));
            //Mete un elemento a la pila
            pila.push('D');
            pila.push('E');
            pila.push('L');
            pila.push('A');
            pila.push('C');
            pila.push('R');
            pila.push('U');
            pila.push('Z');
            ////Saca dos elementos de la pila
            pila.pop();
            pila.pop();
                //Itera el ciclo for
                for(Character pilita: pila){
                    //Imprime el resultado de la pila
                    System.out.println(pilita);
        }
    }
}