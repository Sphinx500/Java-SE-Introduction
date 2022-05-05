import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //variable de entrada
        int response = 0;
        do{
            System.out.println("Selecciona el numero de la operacion");
            System.out.println("1.Movies");
            System.out.println("2.Series");
            System.out.println("0. Salir");

            //Capturar la entrada del usuario
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por la visita");
                    break;
                case 1:
                    System.out.println("MOVIES");
                    break;
                case 2:
                    System.out.println("SERIES");
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
        //Condicion, que la respuesta sea diferente a 0
        } while (response != 0);
        System.out.println("Programa finalizado");
    }
}
