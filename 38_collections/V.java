class V {
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println(e.toString());
        System.out.println(e.hashCode());
        System.out.println(Integer.toHexString(e.hashCode()));
    }
}

class Employee {

}