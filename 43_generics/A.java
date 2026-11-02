import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? super Dog> list1 = new ArrayList<Dog>(); 
        ArrayList<? super Dog> list2 = new ArrayList<Animal>(); 
        ArrayList<? super Dog> list3 = new ArrayList<LivingBeing>(); 
        ArrayList<? super Dog> list4 = new ArrayList<Object>(); 

        // ArrayList<? super Dog> list5 = new ArrayList<Human>();  //not ok

        // ArrayList<? super Dog> list5 = new ArrayList<BDog>();  //not ok
    }
}
