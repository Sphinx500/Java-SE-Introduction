public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //devuelve entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve entero hacia abajo
        System.out.println(Math.floor(x));
        //devuelve numero elevado a otro
        System.out.println(Math.pow(x,y));
        //devuelve el mayor
        System.out.println(Math.max(x,y));
        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //PI * r2
        System.out.println("El area de un cuadrado es: " + Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI r2
        System.out.println("El area de una esfera es: " + 4*Math.PI*Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*PI * r3
        System.out.println("El volumen de una esfera es: " + (4/3)*Math.PI * Math.pow(y,3));
    }
}
