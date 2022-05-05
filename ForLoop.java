public class ForLoop {
    static boolean isTrueOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        //Normalmente 1=0
        for (int i = 1; i <= 10 ; i++) {
            printSos();
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
