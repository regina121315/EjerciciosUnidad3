 class Ejercicio12{

    public static void main(String[] args) {
        // Llamar al método para crear el arreglo y guardarlo en una variable
        char[] arregloCaracteres = crearArreglo();

        // Mostrar el contenido del arreglo
        System.out.println("Arreglo de caracteres:");
        for (char c : arregloCaracteres) {
            System.out.println(c);
        }
    }
 // Método que crea y devuelve un arreglo de caracteres
 public static char[] crearArreglo() {
    char[] arreglo = {'L', 'u', 'i', 's'}; // Inicializa el arreglo con valores
    return arreglo; // Retorna el arreglo
}
}
