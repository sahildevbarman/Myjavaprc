class WW {
    private WW() {

    }
}
class T2 extends WW {
    T2() {
        super();
    }
}

// T2.java:8: error: WW() has private access in WW
//         super();
//         ^
// 1 error