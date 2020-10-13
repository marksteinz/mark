public class MyFirstGame {
    public static void main (String [] args) {
        int computer = 73;
        int my = 73;

        if ( my < computer) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if ( my > computer) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали!");
        }

    }
}