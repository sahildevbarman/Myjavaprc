import java.io.FileNotFoundException;
import java.io.IOException;

class  X4 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class Y4 extends X4 {
    //legal method overriding: NARROWER
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}
