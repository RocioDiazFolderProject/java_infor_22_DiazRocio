import java.util.Scanner;

public class Ejercicio_3_funciones {
    
    public static void main(String[] args) {

        
        nota();

        
    }

    public static void nota(){
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        if (nota>90) {
            System.out.println("Excelente");

        }else if (nota>84){
            System.out.println("Sobresaliente");

        }else if (nota>74){
            System.out.println("Distinguido");
        }else if (nota>59){
            System.out.println("Bueno");
        }else {
            System.out.println("Desaprobado");
        }
    }
}
