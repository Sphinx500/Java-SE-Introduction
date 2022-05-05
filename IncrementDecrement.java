public class IncrementDecrement {
    public static void main(String[] args) {
        //Postfijo
        int lives = 5;
        lives = lives-1;
        System.out.println(lives);//4

        lives--; //Decremento
        System.out.println(lives);//3

        lives++; //Incremento
        System.out.println(lives);//4

        //Prefijo
        //Gana un regalo donde gana una vida
        int gift = 100 + lives++; //Postfijo
        System.out.println(gift);
        System.out.println(lives); //5


    }
}
