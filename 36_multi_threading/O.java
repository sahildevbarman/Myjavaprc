class O {
    static O q = new O();
    public static void main(String[] args) {
        Thread a = new Thread(new D1Runnable(), "Raju");
        Thread b = new Thread(new D2Runnable(), "Kaliya");
    
        a.start();
        b.start();
    }   
    
    static void aaa() { 
        Thread t = Thread.currentThread();
        synchronized(O.q) {  
            for(int i=0;i<30;i++) {
                try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}                          
                System.out.println(t.getName() + " - " + i);                        
            }
        }
    }

    static void bbb() {
        Thread t = Thread.currentThread();
        synchronized(O.q) {  
            for(int i=0;i<30;i++) {
                try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}                          
                System.out.println(t.getName() + " - " + i);                        
            }
        }
    }
}

class D1Runnable implements Runnable {
    public void run() {
        O.aaa();
    }
}

class D2Runnable implements Runnable {
    public void run() {
        O.bbb();
    }
}