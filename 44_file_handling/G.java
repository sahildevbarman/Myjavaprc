import java.io.File;
import java.io.IOException;

class G {
    public static void main(String[] args) {
        File file = new File("C:\\Windows\\System32\\raju.txt");

        try {
            boolean flag = file.createNewFile();

            System.out.println(flag);
        } catch(IOException e) {
            e.printStackTrace();
        }        
    }
}


// java.io.IOException: Access is denied
//         at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
//         at java.base/java.io.File.createNewFile(File.java:1035)
//         at G.main(G.java:9)