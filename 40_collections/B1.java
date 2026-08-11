import java.util.HashMap;

class B1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan", 78);
        map.put("rohan", 89);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put("vikram", 56);

        System.out.println(map);
        
        System.out.println(map.remove("yamraj"));
        
        System.out.println(map);
    }
}