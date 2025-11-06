class T {
    public static void main(String[] args) {
        LivingBeing lb = new BDog();

        Animal anm = lb;
    }
}

// T.java:5: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal anm = lb;
//                      ^
// 1 error