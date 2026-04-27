import java.util.Scanner;

class S {
    static Circle c = new Circle();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Producer(), "Producer");
        Thread t2 = new Thread(new Consumer(), "Consumer");

        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {    
    public void run() {
        while(true) {            
            S.c.writeRadius();            
        }
    }
}

class Consumer implements Runnable {
    public void run() {
        while(true) {
            S.c.readRadius(); 
        }
    }
}

class Circle {
    private int radius;
    static Scanner sc = new Scanner(System.in);

    synchronized void readRadius() {
        if(radius != 0) {
            System.out.println("Consumer-> The new radius read is: " + radius);
            radius = 0;
            notify();
        } else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    } 

    synchronized void writeRadius() {
        if(radius == 0) {
            System.out.print("Producer-> Enter radius: ");
            radius = sc.nextInt();
            notify();
        } else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}