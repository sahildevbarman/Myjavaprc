class ARunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        Thread x = new Thread(new ARunnable(), "Yamraj");

        x.setPriority(MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName());
    }    
}


// A.java:10: error: cannot find symbol
//         x.setPriority(MIN_PRIORITY);
//                       ^
//   symbol:   variable MIN_PRIORITY
//   location: class A
// 1 error