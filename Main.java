class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " eats food.");
    }

    public void sleep() {
        System.out.println(name + " sleeps peacefully.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " meows softly.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " barks loudly.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rocky");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Kitty");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
