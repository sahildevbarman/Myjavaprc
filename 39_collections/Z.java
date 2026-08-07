import java.util.HashMap;

class Z {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println(map.put("mohan", 78));
        System.out.println(map.put("rohan", 89));
        System.out.println(map.put("sohan", 62));
        System.out.println(map.put("ganesh", 100));
        System.out.println(map.put("vikram", 56));

        System.out.println(map.put("sohan", 34));
        System.out.println(map);
    }
}