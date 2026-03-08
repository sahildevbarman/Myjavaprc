import java.io.IOException;

class  X2 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class Y2 extends X2 {
    //legal method overriding: FEWER
    void pro() {
        System.out.println("Hello");
    }
}