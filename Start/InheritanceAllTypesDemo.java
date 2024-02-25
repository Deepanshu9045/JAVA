// Base class for Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Interface for Multiple Inheritance
interface Run {
    void run();
}

interface Swim {
    void swim();
}

// Multiple Inheritance: Duck implements Run and Swim interfaces
class Duck implements Run, Swim {
    public void run() {
        System.out.println("Duck can run");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}

// Multilevel Inheritance: BabyDog is a subclass of Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}

// Hierarchical Inheritance: Cat and Lion are subclasses of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring");
    }
}

public class InheritanceAllTypesDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        System.out.println();

        // Multiple Inheritance
        Duck duck = new Duck();
        duck.run();
        duck.swim();
        System.out.println();

        // Multilevel Inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
        System.out.println();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        System.out.println();

        Lion lion = new Lion();
        lion.eat();
        lion.roar();
    }
}
