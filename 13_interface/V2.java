interface Jumpable {
    void jumpStyle();
    void jumpingFactor();
}
class Car { }
class SportsCar extends Car implements Jumpable { 
    public void jumpStyle() {

    }
}

class Animal { }
class Rabbit extends Animal implements Jumpable {
    public void jumpStyle() {

    }
}

class Toy { }
class Ball extends Toy implements Jumpable {
    public void jumpStyle() {

    }
}

// V2.java:6: error: SportsCar is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class SportsCar extends Car implements Jumpable {
// ^
// V2.java:13: error: Rabbit is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class Rabbit extends Animal implements Jumpable {
// ^
// V2.java:20: error: Ball is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class Ball extends Toy implements Jumpable {
// ^
// 3 errors