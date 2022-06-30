public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("track1", 6);
        Truck truck2 = new Truck("track2", 8);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}