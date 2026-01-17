import java.io.FileReader;
import java.io.FileNotFoundException;
class F {
    F() {
        try {
            FileReader r = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
        System.out.println("A");
        F x = new F();
        System.out.println("B");
    }
}