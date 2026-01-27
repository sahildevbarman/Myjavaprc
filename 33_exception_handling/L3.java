import java.io.FileReader;
import java.io.FileNotFoundException;
class L3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("T");
        aaa();
        System.out.println("H");
    }
    static void aaa() throws FileNotFoundException {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }
    static void bbb() throws FileNotFoundException {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }
    static void ccc() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
        System.out.println("R");
    }
}