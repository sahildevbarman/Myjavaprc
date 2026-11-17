import java.io.File;
import java.io.IOException;

class F {
    public static void main(String[] args) {
        File file = new File("jiyan.txt");

        try {
            boolean flag = file.createNewFile();

            System.out.println(flag);
        } catch(IOException e) {
            e.printStackTrace();
        }        
    }
}
