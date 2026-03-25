class YThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("Inside YThread run method: " + x);
    }
}

class G {
    public static void main(String[] args) {
        YThread t = new YThread();
        t.setName("Golu");
        
        t.run();
    }
}