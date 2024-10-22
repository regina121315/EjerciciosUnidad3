//Nombre de la clase
class Ejercicio10{
    //Metodo main
    public static void main(String[] args) {
        //Inicia la variable a y los guarda en el arreglo
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        //Llama la funcion arreglos
        arreglos(a);
    }
    //hace la funcion
    public static void arreglos(int [] arreglos){
        //Itera el ciclo for con el arreglo
        for(int i = 0;i < arreglos.length; i++){
            //Imprie los numeros
            System.out.println(arreglos[i]);
        }
    }
}