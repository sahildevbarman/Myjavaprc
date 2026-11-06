import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        Rental<Car> x = new Rental<Car>();

        x.add(new Car());
        Car y = x.rent();

        Rental<TV> z = new Rental<TV>();

        z.add(new TV());
        TV t = z.rent();
    }
}

    ArrayList<Q> list = new ArrayList<Q>();

    void add(Q q) {
        list.add(q);
    }

    Q rent() {
        return list.remove(0);
    }
}
