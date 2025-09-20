class J1 {
    int x;

    void pro() {
        y = 90;
    }

    J1() {
        y = 56;
    }
}

// J1.java:5: error: cannot find symbol
//         y = 90;
//         ^
//   symbol:   variable y
//   location: class J1
// J1.java:9: error: cannot find symbol
//         y = 56;
//         ^
//   symbol:   variable y
//   location: class J1
// 2 errors
