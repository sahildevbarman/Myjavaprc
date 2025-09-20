class G {
    G(int w) {

    }
    public static void main(String[] args) {
        G x = new G();

        System.out.println(x);
    }
}

// G.java:6: error: constructor G in class G cannot be applied to given types;
//         G x = new G();
//               ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
