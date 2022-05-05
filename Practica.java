public class Practica {
    public static void main(String[] args) {
        //EJERCICIO 1
        String MY_NAME = "Fernando";
        String FATHERS_NAME = "Jose";
        String MOTHERS_NAME = "Pilar";
        int myAge = 22;

        System.out.println("Mi familia es:");
        System.out.println("Mi nombre es: " + MY_NAME + " Y tengo " + myAge + " años");
        System.out.println("Mi papá se llama: " + FATHERS_NAME);
        System.out.println("Mi mamá se llama: " + MOTHERS_NAME);

        //EJERCICIO 2
        char c = 'z';
        int  i = 250;
        double d = 301.067;
        double s = 5000.66;
        int a = 100;
        int b = 737;
        double e = 298.638;

        //CONVERSIONES

        //Estimación
        //Conversión de char a int
        int convert = (int) c;
        //Conversión de int a log
        long convert2 = (long) i;
        //Conversión de long a short
        short convert3 = (short) i;
        //Conversion de double a long
        long convert4 = (long) d;


        //IMPRESION

        System.out.println(convert);
        System.out.println(convert2);
        System.out.println(convert3);
        System.out.println(convert4);


        //Exactitud

        System.out.println((float)a + s);
        System.out.println((byte)b * a);
        System.out.println((long)e / 25);
    }
}
