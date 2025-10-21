class E1 {
    static void info() {
        System.out.println(this);
    }
}

// E1.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error
