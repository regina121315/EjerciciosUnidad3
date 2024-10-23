
class Tarea11 {//Se declara la clase Tarea11

    public static void main(String[] args) {//Método main
        String[] nombres = {"Carlos", "Mateo", "Emanuel", "Miguel", "Jafet", "Mariana", "Shadow", "Eduardo", "Jonathan", "Valeria"};//Declaración de arreglo tipo String
        nombres(nombres);//Se manda a llamar la función
    }//Llave que cierra el método main

    public static void nombres(String[] nombres) {//Se crea la función nombres
        for (int i = 0; i <= nombres.length - 1; i++) {//Se realiza la iteración del arreglo
            System.out.println(nombres[i]);//Impresión en pantalla del arreglo
        }//Llave que cierra la llave del bucle for
    }//Llave que cierra la función
}//Llave que cierra la clase
