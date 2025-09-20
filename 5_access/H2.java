class H2 {
    public static void main(String[] args) {
        T.pro();
    }
}
class T {
    void pro() {
        System.out.println("Hello world..");
    }
}

// H2.java:3: error: non-static method pro() cannot be referenced from a static context
//         T.pro();
//          ^
// 1 error