import java.io.FileReader;
import java.io.FileNotFoundException;

class C {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            FileReader r = new FileReader("abc.tex");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("B");
    }
}