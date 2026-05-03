class X {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();

        System.out.println("Default Thread Name: " + x.getName());
        System.out.println("Thread Group's Name of Default Thread: " + tg.getName());
    }    
}