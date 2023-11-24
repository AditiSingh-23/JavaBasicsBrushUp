package Practice.OOPS;

public interface Vehicle {
    void gearChange(int a);
    void speedUp(int a);
    void breakApplied(int a);
}

class Bicycle implements Vehicle{
    int gear;
    int speed;
    @Override
    public void gearChange(int gear) {
        this.gear=gear;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void breakApplied(int decrement) {
        speed=speed-decrement;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

class MotorBike implements Vehicle{
    int gear;
    int speed;
    @Override
    public void gearChange(int gearChange) {
        gear=gearChange;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void breakApplied(int decrement) {
        speed=speed-decrement;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
class Miain{
    public static void main(String[] args) {
        Vehicle motorBike=new MotorBike();
        motorBike.gearChange(4);
        motorBike.speedUp(5);
        motorBike.breakApplied(1);
        System.out.println(motorBike);
        Vehicle bicycle=new Bicycle();
        bicycle.gearChange(6);
        bicycle.speedUp(8);
        bicycle.breakApplied(3);
        System.out.println(bicycle);
    }

}