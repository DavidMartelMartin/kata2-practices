package software.ulpgc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    static void main() throws IOException {
        File file = new File("document.txt");
        try (FileInputStream is = new FileInputStream(file)) {
        }
    }
}
