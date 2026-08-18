import java.util.HashMap;

class F1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan", 78);
        map.put("rohan", 89);
        map.put("sohan", 62);
        map.put("ganesh", 100);
        map.put("vikram", 56);

        Boolean x = map.containsValue(99);

        System.out.println(x);
    }
}