public class Casting {
    public static void main(String[] args) {
        double y = 3;
        // En un año ubicar a 30 perritos
        //Cuantos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //devuelve la raiz cuadrada
        System.out.println("EL resultado Casteado es: "+(int)Math.sqrt(y));
        System.out.println("EL resultado sin Castear es: "+Math.sqrt(y));

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double) a/b);

        //Solo castea del resultado de 2 datos
        double c = (double) a/b;
        System.out.println(c);

        //Se forza el codigo en ASCII
        char n = '1';
        int nI = n;
        System.out.println(nI);

        //Marca error por ser mas pequeño
        //short nS = n;
        short nS = (short) n;
        System.out.println( nS);
    }
}
