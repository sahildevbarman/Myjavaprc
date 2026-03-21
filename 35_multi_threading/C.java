class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread run method");
    }
}

class C {
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.start();
        System.out.println("Default Thread main method");
    }
}