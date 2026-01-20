import java.io.FileNotFoundException;
import java.io.FileReader;
class H {
    H() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        System.out.println("A");
        H x = new H();
        System.out.println("B");
    }
}