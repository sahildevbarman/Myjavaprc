class Host {
    public static void main(String[] args) {
        Singer a = new Singer();
        Actor x = new Actor();
        Player y = new Player();

        inviteForDinner(y);
        inviteForDinner(a);
        inviteForDinner(x);
    }

    static void inviteForDinner(Singer bablu) {
        System.out.println("welcome guest");
        System.out.println("serve food");
    }
    static void inviteForDinner(Actor bablu) {
        System.out.println("welcome guest");
        System.out.println("serve food");
    }
    static void inviteForDinner(Player bablu) {
        System.out.println("welcome guest");
        System.out.println("serve food");
    }
}