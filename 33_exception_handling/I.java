import java.io.FileNotFoundException;
import java.io.FileReader;
class I {
    I() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        System.out.println("A");
        try {
            I x = new I();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("B");
    }
}