class X {
    X(int x) {

    }
    X() {
        this(2);
        super();
    }
}

// X1.java:7: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error
