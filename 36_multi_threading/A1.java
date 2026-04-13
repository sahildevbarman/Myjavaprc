class A1Runnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A1 {
    public static void main(String[] args) {
        Thread x = new Thread(new A1Runnable(), "Yamraj");

        x.setPriority(Thread.MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName());
    }    
}