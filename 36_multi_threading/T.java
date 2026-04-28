class T {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isDaemon();

        System.out.println(x.getName() + " - Is Daemon: " + flag);
    }
}