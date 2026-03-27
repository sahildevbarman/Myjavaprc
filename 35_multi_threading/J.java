class MThread extends Thread {
    public void run() {
        System.out.println("~~~~~~~~~~~~~~~~");
    }    
}

class J {
    public static void main(String[] args) {
        MThread a = new MThread();
        MThread b = new MThread();
        MThread c = new MThread();

        // System.out.println(Thread.currentThread().getName());
        System.out.println(a.getName() + " - " + a.getId() + " - " + a.getPriority());
        System.out.println(b.getName() + " - " + b.getId() + " - " + b.getPriority());
        System.out.println(c.getName() + " - " + c.getId() + " - " + c.getPriority());
    }
}