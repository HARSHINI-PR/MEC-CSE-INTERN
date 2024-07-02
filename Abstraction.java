package basics;
abstract class Bird {
    public abstract void makeSound();
    public abstract void fly();
    public void birdType(String type) {
        System.out.println("Bird Type: " + type);
    }
}
class Sparrow extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
    @Override
    public void fly() {
        System.out.println("Sparrow flies at a medium height");
    }
}
class Eagle extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Eagle screeches");
    }
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Sparrow mySparrow = new Sparrow();
        mySparrow.birdType("Sparrow");
        mySparrow.makeSound();
        mySparrow.fly();
        Eagle myEagle = new Eagle();
        myEagle.birdType("Eagle");
        myEagle.makeSound();
        myEagle.fly();
    }
}
