
U.java
100%
import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        ArrayList<? extends Animal> x = new ArrayList<BDog>();   
        // ArrayList<? extends Animal> x = new ArrayList<Dog>();   
        // ArrayList<? extends Animal> x = new ArrayList<Cow>();   
        // ArrayList<? extends Animal> x = new ArrayList<Cat>();   
        // ArrayList<? extends Animal> x = new ArrayList<Animal>();   
        // ArrayList<? extends Animal> x = new ArrayList<LivingBeing>();   
    }    
}


class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
Displaying U.java.