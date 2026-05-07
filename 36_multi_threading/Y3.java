class Y3 {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup().getParent();

        System.out.println("Default Thread's Parent THread Group: " + tg.getName());

        tg.list();
    }
}