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
class J1 extends R {
    void aaa() {
        System.out.println("aaa from class J");
    }
   /* void bbb() {
        System.out.println("bbb from class J");
    }*/
    void ccc() {
        System.out.println("ccc from class J");
    }
    public static void main(String[] args) {
        J1 j = new J1();

        j.aaa();
        j.bbb();
        j.ccc();
    }
}