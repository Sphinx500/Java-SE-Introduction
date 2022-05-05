public class WhileLoop {
    static boolean isTrueOnLight = false;

    public static void main(String[] args) {
       turnOnOffLight();

       //Control cuando llegue a 10
       int i = 1;
       while (isTrueOnLight && i <= 10){
           printSos();
           i++;
       }
    }

    //Void no devuelve nada
    public static void printSos(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){
        //Evaluar
        isTrueOnLight = (isTrueOnLight)? false:true;
        return isTrueOnLight;
    }
}
