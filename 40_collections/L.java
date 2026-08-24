import java.util.HashMap;

class L {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan", 78);
        map.put(null, 54);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put(null, 12);        

        System.out.println(map);
    }
}