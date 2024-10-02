package JavaAssignment6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        System.out.println("Dog: " + dog.sound() + ", " + dog.move());
        System.out.println("Cat: " + cat.sound() + ", " + cat.move());
        System.out.println("Bird: " + bird.sound() + ", " + bird.move());
    }
}