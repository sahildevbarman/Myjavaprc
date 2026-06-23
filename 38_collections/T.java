import java.util.HashSet;

class T {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student("hritik", 12));
        set.add(new Student("ratnesh", 18));
        set.add(new Student("raj", 9));
        set.add(new Student("vikki", 12));
        set.add(new Student("lukky", 15));

        Student x = new Student("raj", 9);
        // System.out.println(set.contains(x));
        System.out.println(set);
        System.out.println(set.remove(x));
        System.out.println(set);
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
        return name + " - " + age;
    }
}