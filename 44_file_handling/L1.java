import java.io.File;
import java.io.IOException;

class L1 {
    public static void main(String[] args) throws IOException {        

        File fl = new File( "YAMRAJ\\monu.txt");
        //folder YAMRAJ does not exist

        System.out.println(fl.createNewFile());
    }
}


// IOException