
class Tarea12 {//Se declara la clase Tarea12

    public static void main(String[] args) {//Método main
        char[] nombre = {'S', 't', 'e', 'p', 'h', 'a', 'n', 'i', 'e'};//Declaración de arreglo tipo Char
        nombre(nombre);//Se manda a llamar la función
    }//Llave que cierra el método main

    public static void nombre(char[] nombre) {//Se crea la función nombre
        for (int i = 0; i <= nombre.length - 1; i++) {//Se realiza la iteración del arreglo
            System.out.println(nombre[i]);//Impresión en pantalla del arreglo
        }//Llave que cierra la llave del bucle for
    }//Llave que cierra la función
}//Llave que cierra la clase
