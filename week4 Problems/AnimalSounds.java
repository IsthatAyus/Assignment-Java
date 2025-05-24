class Animal{
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cow moo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound(); 
        cat.makeSound();
        cow.makeSound();
    }
}
