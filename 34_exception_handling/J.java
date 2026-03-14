import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class  X7 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}

class Y7 extends X7 {
    //illegal method overriding: WIDER
    void pro() throws IOException {
        System.out.println("Hello");
    }
}


// J.java:13: error: pro() in Y7 cannot override pro() in X7
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error