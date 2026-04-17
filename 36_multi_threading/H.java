class Transaction implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            H.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal.. the balance is Rs " + H.ac.getBalance());
        }
    }
}

class H {
    static Account5 ac = new Account5();

    public static void main(String[] args) {
        Transaction t = new Transaction();
        Thread a = new Thread(t, "mohan");
        Thread b = new Thread(t, "sohan");

        a.start();
        b.start();
    }    
}