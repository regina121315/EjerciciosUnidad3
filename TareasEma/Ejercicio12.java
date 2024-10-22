//Nombre de la clase
class Ejercicio12{
    //Metodo main
    public static void main(String[] args) {
        //Inicia la variable a y los guarda en el arreglo
        String [] a = {"E","M","A","N","U","E","L"};
        //Llama la funcion arreglos
        letras(a);
    }
    //hace la funcion
    public static void letras(String [] letras){
        //Itera el ciclo for con el arreglo
        for(int i = 0;i < letras.length; i++){
            //Imprie los nombres
            System.out.println(letras[i]);
        }
    }
}