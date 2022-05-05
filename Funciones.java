public class Funciones {

    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //PI * r2
        double area = circleArea(y);
        System.out.println("El area de un cuadrado es: " + area);

        //Area de una esfera
        //4*PI r2
        System.out.println("El area de una esfera es: " + sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI * r3
        System.out.println("El volumen de una esfera es: " + sphereVolumen(y));

        System.out.println("PESOS A DOLARES " + convertToDolar(200,"MXN"));

    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public  static double sphereVolumen(double r){
        return (4/3)*Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Función que especificando su moneda convierte una cantidad
     * de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * **/
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.50;
                break;
            case "COP":
                quantity = quantity * 0.00031;
        }
        return  quantity;
    }

}