class Host {
    public static void main(String[] golu) {
        Singer a = new Singer();
        Actor x = new Actor();
        Player y = new Player();

        inviteForDinner(y);
        inviteForDinner(a);
        inviteForDinner(x);
    }

    static void inviteForDinner(Singer bablu) {
        System.out.println(bablu);
    }
    static void inviteForDinner(Actor bablu) {
        System.out.println(bablu);
    }
    static void inviteForDinner(Player bablu) {
        System.out.println(bablu);
    }
}