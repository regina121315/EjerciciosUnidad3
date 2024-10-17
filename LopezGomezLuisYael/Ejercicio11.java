class Ejercicio11{
    
    public static void main(String[] args) {
        // Llamar al método para crear el arreglo y guardarlo en una variable
        String[] arregloPalabras = crearArreglo();

        // Mostrar el contenido del arreglo
        System.out.println("Arreglo de palabras:");
        for (String s : arregloPalabras) {
            System.out.println(s);
        }
    }
 // Método que crea y devuelve un arreglo de caracteres
 public static String[] crearArreglo() {
    String[] arreglo = {"Hola","Lluvia","Calor","Frio", "Agua","Cagar","Llevar","Traer","Saltar","correr"}; // Inicializa el arreglo con valores
    return arreglo; // Retorna el arreglo
}
}

