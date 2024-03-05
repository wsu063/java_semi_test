package java_02.quiz07;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
