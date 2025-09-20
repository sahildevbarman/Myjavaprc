class A1 {
    void laugh() {
        System.out.println("I can laugh");
    }
}

class A2 extends A1 {
    void talk() {
        System.out.println("I can talk");
    }
}

class A3 extends A2 {
    void walk() {
        System.out.println("I can walk");
    }
}

class F extends A3 {
    public static void main(String[] args) {
        F x = new F();

        x.talk();
        x.walk();
        x.laugh();
    }
}