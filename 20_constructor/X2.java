class X {
    X(int x) {

    }
    X() {
        this(2); super();
    }
}

// X2.java:6: error: call to super must be first statement in constructor
//         this(2); super();
//                       ^
// 1 error
