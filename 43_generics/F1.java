class F1 {
    public static void main(String[] args) {
        WW x = new WW();

        x.pro(new Cat());
    }    
}


class WW {
    <T> void pro(T x) {
        System.out.println(x);  
        if(x instanceof Cat) {
            Cat cat = (Cat)x;
            cat.info();
        }      
    }
}
