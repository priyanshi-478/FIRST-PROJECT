// Simple inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Multilevel inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

// Hierarchical inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Simple inheritance
        Animal a = new Animal();
        a.eat();
    
        // Multilevel inheritance
        BabyDog b = new BabyDog();
        b.eat(); // From Animal
        b.bark(); // From Dog
        b.weep(); // From BabyDog
    
        // Hierarchical inheritance
        Cat c = new Cat();
        c.eat(); // From Animal
        c.meow(); // From Cat
    
        // Final print statement
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}
