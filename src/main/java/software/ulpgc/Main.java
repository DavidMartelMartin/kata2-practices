package software.ulpgc;

public class Main {
    static void main() {
        String text = "¡Viva España!";

        byte[] bytes = text.getBytes();

        System.out.println(new String(bytes));
    }
}
