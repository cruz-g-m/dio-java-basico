package operadores;

public class Ternários {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ?"verdadeiro" : "falso";

    /*  
        String resultado = "";          
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
    */

        System.out.println(resultado);

    }
    
}
