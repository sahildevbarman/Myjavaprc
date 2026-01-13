import java.io.FileReader;
class B {
    public static void main(String[] args) {
        FileReader r = new FileReader("abc.txt");
    }
}

// B.java:4: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader r = new FileReader("abc.txt");
//                        ^
// 1 error
