
class Tarea10 {//Se declara la clase Tarea10

    public static void main(String[] args) {//Método main
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//Declaración de arreglo entero
        arreglos(num);//Se manda a llamar la función
    }

    public static void arreglos(int[] arreglos) {//Se crea la función arreglos
        for (int i = 0; i <= arreglos.length - 1; i++) {//Se realiza la iteración del arreglo
            System.out.println(arreglos[i]);//Impresión en pantalla del arreglo
        }//Llave que cierra la llave del bucle for
    }//Llave que cierra la función
}//Llave que cierra la clase
