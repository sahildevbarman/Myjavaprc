class S1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        BDog bdog = new BDog();

        Animal anm;

        anm = cow;
        System.out.println(anm);

        anm = cat;
        System.out.println(anm);

        anm = dog;
        System.out.println(anm);

        anm = bdog;
        System.out.println(anm);
    }
}