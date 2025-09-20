class C {
    public static void main(String[] args) {
        System.out.println(y);
    }
}
class Z {
    int y = 9;
}

// C.java:3: error: cannot find symbol
//         System.out.println(y);
//                            ^
//   symbol:   variable y
//   location: class C
// 1 error