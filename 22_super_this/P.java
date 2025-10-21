class P {
    P pro() {
        return this;
    }
    public static void main(String[] args) {
        P x = new P();
        P y = x.pro();

        System.out.println(x);
        System.out.println(y);
    }
}