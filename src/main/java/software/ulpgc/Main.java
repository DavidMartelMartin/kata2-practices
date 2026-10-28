package software.ulpgc;

import java.io.*;
import java.net.URL;

public class Main {
    static void main() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        try (Reader reader = new InputStreamReader(url.openStream())) {
        }
    }
}
