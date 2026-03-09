import java.io.FileNotFoundException;
import java.io.EOFException;

class  X3 {
    void pro() throws FileNotFoundException, EOFException {
        System.out.println("Hello");
    }
}

class Y3 extends X3 {
    //legal method overriding: FEWER
    void pro() throws EOFException {
        System.out.println("Hello");
    }
}