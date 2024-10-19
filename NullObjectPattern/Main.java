package NullObjectPattern;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Au Au");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}

class NullAnimal implements Animal {
    @Override
    public void makeSound() {
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return new NullAnimal(); 
    }
}

public class Main {
    public static void main(String[] args) { 
        Animal animal1 = AnimalFactory.getAnimal("dog");
        animal1.makeSound(); 

        Animal animal2 = AnimalFactory.getAnimal("cat");
        animal2.makeSound(); 

        Animal animal3 = AnimalFactory.getAnimal("elephant");
        animal3.makeSound(); 
    }
}

