import java.util.ArrayList;

class D {
    public static void main(String[] args) {
        CarRental x = new CarRental();
        
        x.addCar(new Car());
        Car y = x.rentCar();
    }    
}

class CarRental { 
    ArrayList<Car> list = new ArrayList<Car>();

    void addCar(Car car) {
        list.add(car);
    }

    Car rentCar() {
        return list.remove(0);
    }
}



class TVRental {
    ArrayList<TV> list = new ArrayList<TV>();

    void addTV(TV tv) {
        list.add(tv);
    }

    TV rentTV() {
        return list.remove(0);
    }
}



class ScooterRental {
    ArrayList<Scooter> list = new ArrayList<Scooter>();

    void addScooter(Scooter scooter) {
        list.add(scooter);
    }

    Scooter rentScooter() {
        return list.remove(0);
    }
}
