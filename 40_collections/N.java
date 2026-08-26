import java.util.Hashtable;

class N {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("mohan", 78);
        map.put(null, 54);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put(null, 12);        

        System.out.println(map);
    }
}

// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:480)
//         at N.main(N.java:8)