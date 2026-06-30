class Y {
    public static void main(String[] args) {
        Student x = new Student("Gurmeet", 21);
        Student y = new Student("Gurmeet", 21);
        Student z = new Student("Gurmeet", 21);

        // It is reflexive
        // System.out.println(x.equals(x));
        // System.out.println(y.equals(y));
        // System.out.println(z.equals(z));

        // It is symmetric:
        // System.out.println(x.equals(y) + " - " + y.equals(x));
        // System.out.println(x.equals(z) + " - " + z.equals(x));
        // System.out.println(z.equals(y) + " - " + y.equals(z));

        // It is transitive:
        // System.out.println(x.equals(y) + " - " + y.equals(z) + " - " + z.equals(x));

        // It is consistent:
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));

        // null test must produce false
        System.out.println(x.equals(null));
        System.out.println(y.equals(null));
        System.out.println(z.equals(null));
    }
}




class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    } 

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student a = this;
            Student b = (Student)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }
      
        return flag;        
    }
}