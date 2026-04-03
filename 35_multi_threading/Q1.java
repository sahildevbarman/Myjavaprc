class NThread extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);  
        } catch(InterruptedException e) {
            e.printStackTrace();
        } 
        
        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        }         
    }
}

class Q1 {
    public static void main(String[] args)  {
        NThread x = new NThread();
        x.setName("Raju");
        x.start();

        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        } 
    }
}