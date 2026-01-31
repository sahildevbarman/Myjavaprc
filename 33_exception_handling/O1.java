import java.io.FileNotFoundException;
import java.io.FileReader;
class O1 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(3);
    }
}