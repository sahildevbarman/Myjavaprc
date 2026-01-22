import java.io.FileNotFoundException;
import java.io.FileReader;
class J {
    J() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    } 
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A");

        J x = new J();

        System.out.println("B");
    }
}