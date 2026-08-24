import java.util.HashMap;

class K {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan", 78);
        map.put("rohan", null);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put("vikram", null);        

        System.out.println(map);
    }
}