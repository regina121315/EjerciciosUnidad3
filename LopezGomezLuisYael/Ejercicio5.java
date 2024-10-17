import java.util.Scanner;
class Ejercicio5{
    public static void main(String[] args) {
        //crear scanner
        Scanner sn=new Scanner(System.in);
        // pedir datos
        System.out.println("Ingresa el primer numero");
        int a=sn.nextInt();
        //imprime el resultado
                int r= modulodeunnumero(a);
        System.out.println("El módulo es: "  + r);
    }
    //ingresa la funcion
    public static int modulodeunnumero(int x){
       //envaluar datos
        if (x<0){
            return -x;
        }else{
            return x;
        }
    }
    }
