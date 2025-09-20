class AA extends CC {
    AA() {
        System.out.println("Golu");
    }
}
class BB extends AA {
    BB() {
        System.out.println("Bablu");
    }
}
class CC {
    CC() {
        System.out.println("taplu");
    }
}
class I {
    public static void main(String[] args) {
        System.out.println("chhotabheem");
        BB x = new BB();
        System.out.println("raju");
    }
}