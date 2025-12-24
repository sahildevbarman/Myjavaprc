class N1 {
    public static void main(String[] args) {
        Float f = Float.valueOf(4.56);
        // Float f = Float.valueOf((float)4.56);

        System.out.println(f);
    }
}

// N1.java:3: error: no suitable method found for valueOf(double)
//         Float f = Float.valueOf(4.56);
//                        ^
//     method Float.valueOf(String) is not applicable
//       (argument mismatch; double cannot be converted to String)
//     method Float.valueOf(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error
