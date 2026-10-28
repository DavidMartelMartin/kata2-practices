package software.ulpgc;

import java.io.*;

public class Main {
    static void main() throws IOException {
        File file = new File("document.txt");
        try (Reader reader = new FileReader(file)) {
        }
    }
}
