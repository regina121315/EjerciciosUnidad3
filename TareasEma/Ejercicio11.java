//Nombre de la clase
class Ejercicio11{
    //Metodo main
    public static void main(String[] args) {
        //Inicia la variable a y los guarda en el arreglo
        String [] a = {"Emanuel","Miguel","Stephanie","Mariana","Jafet","Jonathan","Jorge","Jason","Regina","Carlos"};
        //Llama la funcion arreglos
        nombres(a);
    }
    //hace la funcion
    public static void nombres(String [] nombre){
        //Itera el ciclo for con el arreglo
        for(int i = 0;i < nombre.length; i++){
            //Imprie los nombres
            System.out.println(nombre[i]);
        }
    }
}