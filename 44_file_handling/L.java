import java.io.File;
import java.io.IOException;

class L {
    public static void main(String[] args) throws IOException {        

        File fl = new File("D:\\javaprac", "44_file_handling_reading_writing\\monu.txt");

        fl.createNewFile();
    }
}
