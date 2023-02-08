package lesson10;

public class Car {
    public void carModel() {
        System.out.println("Car exhibition. Best cars!");
    }
}

class BMW extends Car {
    public void carModel() {
        System.out.println("BMW X7");
    }
}

class Toyota extends Car {
    public void carModel() {
        System.out.println("Toyota Highlander");
    }
}


class Mercedes extends Car {
    public void carModel() {
        System.out.println("Mercedes‑Benz GLS");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car bmw = new BMW();
        Car toyota = new Toyota();
        Car mers = new Mercedes();
        car.carModel();
        bmw.carModel();
        toyota.carModel();
        mers.carModel();

    }
}


