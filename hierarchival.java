package basics;
class animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class dog extends animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class hierarchival {
    public static void main(String[] args) {
        dog dog = new dog();
        Cat cat = new Cat();
        dog.eat();
        dog.bark();
        System.out.println();

        cat.eat();
        cat.meow();
    }
}