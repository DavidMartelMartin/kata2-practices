package software.ulpgc;

public class Main {
    static void main() {
        byte[] bytes = "¡Viva España!".getBytes();
        System.out.println(new String(bytes));
    }
}
