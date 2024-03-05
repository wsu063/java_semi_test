package java_01.quiz08;

public class Car extends Tire {
    String model;
    double maxSpeed;
    Tire tire;

    public Car(String company, String model, double maxSpeed) {
        super(company, 8); // 타이어 사이즈 임의대입
        this.model = model;
        this.maxSpeed = maxSpeed;
        tire = new Tire(company, 8);
    }

}

