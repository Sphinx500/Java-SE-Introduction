public class IfStatement {
    public static void main(String[] args) {
        boolean isBluethoothEnable = true;
        int fileSended = 3;

        if (isBluethoothEnable){
            fileSended +=1;
            //Envio de archivo
            System.out.println("Archivo Enviado " + " Numero de archivo: " + fileSended);
        //Condicion no se cumple
        }else {
            System.out.println("El Bluetooth no está activado");
        }
        System.out.println(isBluethoothEnable);
        System.out.println(fileSended);
    }
}
