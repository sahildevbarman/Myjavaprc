class R {
    void aaa() {
        System.out.println("aaa from class R");
    }
    final void bbb() {
        System.out.println("bbb from class R");
    }
    void ccc() {
        System.out.println("ccc from class R");
    }
}
class J extends R {
    void aaa() {
        System.out.println("aaa from class J");
    }
    void bbb() {
        System.out.println("bbb from class J");
    }
    void ccc() {
        System.out.println("ccc from class J");
    }

    public static void main(String[] args) {
        J j = new J();
        j.aaa();
        j.bbb();
        j.ccc();
    }
}

// J.java:16: error: bbb() in J cannot override bbb() in R
//     void bbb() {
//          ^
//   overridden method is final
// 1 error

