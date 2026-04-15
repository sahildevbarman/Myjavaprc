class Transaction implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            C.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal.. the balance is Rs " + C.ac.getBalance());
        }
    }
}

class C {
    static Account ac = new Account();

    public static void main(String[] args) {
        Transaction t = new Transaction();
        new Thread(t, "mohan").start();
        new Thread(t, "sohan").start();
    }    
}