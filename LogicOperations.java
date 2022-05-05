public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Operadores de asignacion
        System.out.println("a es igual a b? => "+ (a==b));
        System.out.println("a es diferente a b? => "+ (a!=b));

        //operadores relacionales
        System.out.println("a es mayor a b? => "+ (a>b));
        System.out.println("a es menor a b? => "+ (a<b));

        System.out.println("a es mayor o igual a b? => "+ (a>=b));
        System.out.println("a es menor o igual a b? => "+ (a<=b));

        if (a == b){
            System.out.println("a y b son iguales");
        }
        else if (a!=b) {
            System.out.println("a es diferente de b");
            if (a > b) {
                System.out.println("Ademas a es mayor que b");
            } else if (a < b) {
                System.out.println("Ademas b es mayor que a");
            }
        }
    }
}
