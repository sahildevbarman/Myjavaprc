import java.io.File;
import java.io.IOException;

class K1 {
    public static void main(String[] args) throws IOException {
        File file = new File("PYTHON");

        file.mkdir();

        File fl = new File(file, "A.py");

        fl.createNewFile();
    }
}
