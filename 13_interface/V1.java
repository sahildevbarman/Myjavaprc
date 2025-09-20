interface Jumpable {
    void jumpable();
    void jumpingFactor();
}

class Car { }
class SportsCar extends Car implements Jumpable {

}

class Animal { }
class Rabbit extends Animal implements Jumpable {

}

class Toy { }
class Ball extends Toy implements Jumpable {
    
}

// V1.java:7: error: SportsCar is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class SportsCar extends Car implements Jumpable {
// ^
// V1.java:12: error: Rabbit is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class Rabbit extends Animal implements Jumpable {
// ^
// V1.java:17: error: Ball is not abstract and does not override abstract method jumpingFactor() in Jumpable
// class Ball extends Toy implements Jumpable {
// ^
// 3 errors
