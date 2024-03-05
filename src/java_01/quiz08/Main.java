package java_01.quiz08;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("현대자동차", "쏘나타", 18.9);
        System.out.println(car.company + " " + car.model + " " + car.maxSpeed + " "
                 +  car.tire.size);
    }
}
