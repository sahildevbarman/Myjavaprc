class D {
    public static void main(String[] args) {
        BDog x = new BDog();

        //Case 1:
        // if(x instanceof BDog) 
        //     System.out.println("BDog Object IS-A BDog");

       //Case 2:
    //    if(x instanceof Dog)
    //        System.out.println("BDog Object IS-A Dog");

    //   //Case 3:
    //   if(x instanceof Animal) 
    //       System.out.println("BDog Object IS-A Animal");

    //   //Case 4:
    //   if(x instanceof LivingBeing)
    //       System.out.println("BDog Object IS-A LivingBeing");    

    //   //Case 5:
    //   if(x instanceof Object)
    //       System.out.println("BDog Object IS-A Object");

    //   //Case 6:
      if(x instanceof Human)
          System.out.println("BDog Object IS-A Human");

          else 
             System.out.println("BDog Object IS-not-A Human");              
    }
}

class Human {

}

class BDog {

}

// D.java:26: error: incompatible types: BDog cannot be converted to Human
//       if(x instanceof Human)
//          ^
// 1 error