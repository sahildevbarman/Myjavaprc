class Car { }
class SportsCar extends Car { }

class E {
    static void pro(Car car) {
        System.out.println("Car");
    }
    static void pro(SportsCar sportsCar) {
        System.out.println("SportsCar");
    }
    public static void main(String[] args) {
       Car x = new SportsCar();

       pro(x);
    }
}