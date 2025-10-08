class RRR {
    private RRR() {

    }
    static RRR createObject() {
        //step - 1
        //step - 2

        RRR r = new RRR();

        return r;
    }
}
class V {
    public static void main(String[] args) {
        RRR x = RRR.createObject();
        RRR y = RRR.createObject();
        System.out.println(x);
        System.out.println(y);
    }
}