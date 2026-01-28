import java.io.FileReader;
import java.io.FileNotFoundException;

class M {
    public static void main(String[] args) {
        System.out.println("T");
        aaa();
        System.out.println("H");
    }
    static void aaa() {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }
    static void bbb() {
        System.out.println("K");

        try{
            ccc();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Q");
    }
    static void ccc() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
        System.out.println("R");
    }
}