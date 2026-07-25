import java.util.TreeSet;
import java.io.Console;
import java.util.Comparator;

class N {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println("Press 1 for NS, \n2 for NDS \n3 for AS\n4 for ADS: ");
        int input = Integer.parseInt(con.readLine());

        Comparator comp = null;

        if(input == 1) {
            comp = new NameSort();
        } else if(input == 2) {
            comp = new NameDscSort();
        } else if(input == 3) {
            comp = new AgeSort();
        } else if(input == 4) {
            comp = new AgeDscSort(); 
        }

        TreeSet set = new TreeSet(comp);

        set.add(new Student("karthik", 18));
        set.add(new Student("simha", 9));
        set.add(new Student("vijendra", 12));
        set.add(new Student("prasad", 5));
        set.add(new Student("ganesh", 10));

        System.out.println(set);
    }
}

class NameSort implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm2.compareTo(nm1);
    }
}

class AgeSort implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

        return ag1.compareTo(ag2);
    }
}

class AgeDscSort implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

        return ag2.compareTo(ag1);
    }
}


class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ^ " + age;
    }
}