class Vehicle {
    public void applyBrake() {
        System.out.println("Brake Applied");
    }

    public void applyHorn() {
        System.out.println("Horn Applied");
    }
}

class Car extends Vehicle {
    public void fourWheelerEnabled() {
        System.out.println("4 Wheeler");
    }

    public void applyAcceleration() {
        System.out.println("200kmph");
    }
}

class BMW extends Car {
    public void sevenSeater() {
        System.out.println("7 Seater");
    }
}

class Auto extends Vehicle {
    public void applyAcceleration() {
        System.out.println("100kmph");
    }
}

public class Main {
    public static void main(String[] args) {
        BMW bm = new BMW();
        System.out.println("BMW Features:");
        bm.sevenSeater();
        bm.fourWheelerEnabled();
        bm.applyBrake();
        bm.applyHorn();
        bm.applyAcceleration();

        System.out.println("\nAuto Features:");
        Auto auto = new Auto();
        auto.applyBrake();
        auto.applyHorn();
        auto.applyAcceleration();
    }
}
