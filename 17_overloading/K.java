class K {
    public static void main(String[] args) {
        Bathua x = new Bathua();
        prepareBathua(x);

        Norpa y = new Norpa();
        prepareNorpa(y);

        Cholai t = new Cholai();
        prepareCholai(t);
    }

    static void prepareCholai(Cholai x) {
        System.out.println("--------- Cholai ------- start ------");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - 6");
    }
    static void prepareNorpa(Norpa x) {
        System.out.println("--------- Norpa -------- start ------");
        System.out.println("step - 1");
        System.out.println("step - 3");
        System.out.println("step - 5");
        System.out.println("step - 7");
    }
    static void prepareBathua(Bathua x) {
        System.out.println("-------- Bathua ------- start -------");
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - 4");
        System.out.println("step - 5");
    }
}