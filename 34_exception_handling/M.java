class  X9 {
    void pro() throws ArrayIndexOutOfBoundsException {
        System.out.println("Hello");
    }
}

class Y9 extends X9 {
    //always legal method overriding: unchecked exception
    void pro() throws ArithmeticException {
        System.out.println("Hello");
    }
}