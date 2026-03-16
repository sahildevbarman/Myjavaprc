class  X8 {
    void pro() throws ArrayIndexOutOfBoundsException {
        System.out.println("Hello");
    }
}

class Y8 extends X8 {
    //always legal method overriding: unchecked exception
    void pro() throws IndexOutOfBoundsException {
        System.out.println("Hello");
    }
}