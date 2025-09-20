interface Smart { }

interface Intelligent { }

interface Beautiful { }

class Human { }

class American implements Smart, Intelligent, Beautiful extends Human {

}

// P2.java:9: error: '{' expected
// class American implements Smart, Intelligent, Beautiful extends Human {
//                                                        ^
// 1 error