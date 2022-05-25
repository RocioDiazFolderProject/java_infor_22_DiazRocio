import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nro;
        int continuar = 1;

       

        while (continuar ==1) {
            System.out.println("Por favor ingrese un nro");
            nro = scan.nextInt();
            System.out.println("El nro ingresado es: "+nro);

            System.out.println("si quiere continuar presione 1, sino cualquier otro número");
            continuar = scan.nextInt();
        }
        scan.close();
    }

    
}
