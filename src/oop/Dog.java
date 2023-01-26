package oop;

public class Dog {
    String breed;
    String name;
    int age;
    double weight;
    int speed;

    public Dog(String breed, String name, int age, double weight, int speed) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
    }

    public Dog() {
    }

    public void Message() {
        System.out.println("Doggies!");
    }
}

class Main {
    public static void main(String[] args) {

        Dog dogMsg = new Dog();
        dogMsg.Message();
        Dog dog1 = new Dog("Pitbull", "Marik", 3, 7.3, 55);
        Dog dog2 = new Dog("Dachshund", "Sheila", 4, 4.2, 50);
        Dog dog3 = new Dog("Labrador", "Busia", 7, 30.8, 20);
        Dog dog4 = new Dog("Haski", "Zubr", 2, 16.0, 40);
        Dog dog5 = new Dog("Akita", "Mally", 4, 32.8, 32);

        System.out.println(dog1.breed + ":" + "\n" + dog1.name + "\n" + dog1.age + "\n" + dog1.weight + "\n" + dog1.speed);
        System.out.println(dog2.breed + ":" + "\n" + dog2.name + "\n" + dog2.age + "\n" + dog2.weight + "\n" + dog2.speed);
        System.out.println(dog3.breed + ":" + "\n" + dog3.name + "\n" + dog3.age + "\n" + dog3.weight + "\n" + dog3.speed);
        System.out.println(dog4.breed + ":" + "\n" + dog4.name + "\n" + dog4.age + "\n" + dog4.weight + "\n" + dog4.speed);
        System.out.println(dog5.breed + ":" + "\n" + dog5.name + "\n" + dog5.age + "\n" + dog5.weight + "\n" + dog5.speed);

    }
}
