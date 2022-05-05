public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelect = "Dark";
        String mensaje = "Selected: ";

        switch (colorModeSelect){
            case "Light":
                System.out.println(mensaje + "Light Mode");
                break;
            case "Night":
                System.out.println(mensaje + "Night Mode");
                break;
            case "Blue Dark":
                System.out.println(mensaje + "Blue Dark Mode");
                break;
            case "Dark":
                System.out.println(mensaje + "Dark Mode");
                break;
            default:
                System.out.println("Por favor selecciona una opción");
        }
    }
}
