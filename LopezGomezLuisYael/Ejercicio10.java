public class Ejercicio10{
public static void main(String[] args) {
    int[] arreglo = crearArreglo();
        // Mostrar el contenido del arreglo
        System.out.println("Arreglo :");
        for (int num : arreglo) {
            System.out.println(num);
        }
}

public static int [] crearArreglo(){
    int[] arreglo = new int[10];

    for (int i = 0; i< arreglo.length; i++) {
        arreglo[i]=i*2;
    }
 return arreglo;
}

}

