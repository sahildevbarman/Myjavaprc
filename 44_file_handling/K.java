import java.io.File;
import java.io.IOException;

class K {
    public static void main(String[] args) throws IOException {
        File file = new File("JAVA");

        file.mkdir();

        File fl = new File("JAVA/A.java");

        fl.createNewFile();
    }
}
