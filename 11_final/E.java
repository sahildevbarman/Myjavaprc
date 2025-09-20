class V {
    int w = 21;

    void pro() {
        System.out.println("Namaskaram");
    }
}

class E {
    void pro() {
        System.out.println("Jay Ho");
    }

    public static void main(String[] args) {
        E x = new E();

        System.out.println(x.w);

        x.pro();
    }
}

// E.java:17: error: cannot find symbol
//         System.out.println(x.w);
//                             ^
//   symbol:   variable w
//   location: variable x of type E
// 1 error
