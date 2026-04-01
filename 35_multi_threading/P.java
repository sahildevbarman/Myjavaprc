class GThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        }         
    }
}

class P {
    public static void main(String[] args) {
        GThread x = new GThread();
        x.setName("Raju");
        x.start();

        try {
            x.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        

        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        } 
    }
}