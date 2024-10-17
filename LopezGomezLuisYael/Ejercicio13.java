import java.util.Scanner;

class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("Ingresa un numero mayor a 20: ");
            a = sc.nextInt();
            int r = evaluar(a);
            System.out.println(r);
        } while (a < 20); // Repite hasta que el número sea mayor o igual a 20

    }

    public static int evaluar(int x) {
        if (x >= 20) {
            System.out.println("El número es mayor o igual a 20.");
            return x; // Retornar el número si es válido
        } else {
            System.out.println("Error: el número no es mayor o igual a 20.");
            return x; // Retornar un valor que indique error
        }
    }
}
