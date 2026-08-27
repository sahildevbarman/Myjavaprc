import java.util.LinkedHashMap;

class O {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("mohan", 78);
        map.put("rohan", 89);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put("vikram", 56);

        System.out.println(map);
    }
}