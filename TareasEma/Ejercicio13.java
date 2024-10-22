//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio13{
        //Metodo main
        public static void main(String[] args) {
            //Objeto scanner
            Scanner op = new Scanner(System.in);
            //Inicia la variabla a
            int a;
            do { 
                //Pide al usuario un dato
                System.out.println("Ingresa un numero:");
                //Guarda el dato en la variable a
                a = op.nextInt();
                validar(a);
            } while (a <= 20);
            //Muestra el resultado de los numeros
            System.out.println("El numero que ingresas si es mayor a 20");
        }
        //Crea la funcion llamada validar y dice si es mayor
        public static void validar(int a) {
            //Condicion if
            if(a < 20);
            //Nos imprime un error que no es mayor y nos dice que ponga otro numero
            System.out.println("El numero ingresado es menor a 20, vuelve a ingresar otro numero");    
        }
    }    