package oop;

public class Dog {
    String breed;
    String name;
    int age;
    double weight;
    int speed;

    public void Message(){
        System.out.println("Doggies!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Dog dog1 = new Dog();
        dog1.breed = "Pitbull";
        dog1.name = "Marik";
        dog1.age = 3;
        dog1.weight = 7.3;
        dog1.speed = 55;

        Dog dog2 = new Dog();
        dog2.breed = "Dachshund";
        dog2.name = "Sheila";
        dog2.age = 4;
        dog2.weight = 4.2;
        dog2.speed = 50;

        Dog dog3 = new Dog();
        dog3.breed = "Labrador";
        dog3.name = "Busia";
        dog3.age = 7;
        dog3.weight = 30.8;
        dog3.speed = 20;

        Dog dog4 = new Dog();
        dog4.breed = "Haski";
        dog4.name = "Zubr";
        dog4.age = 2;
        dog4.weight = 16.0;
        dog4.speed = 40;

        Dog dog5 = new Dog();
        dog5.breed = "Akita";
        dog5.name = "Mally";
        dog5.age = 4;
        dog5.weight = 32.8;
        dog5.speed = 32;

        dog.Message();
        System.out.println(dog1.breed + ":" + "\n" + dog1.name + "\n" + dog1.age + "\n" + dog1.weight + "\n" + dog1.speed);
        System.out.println(dog2.breed + ":" + "\n" + dog2.name + "\n" + dog2.age + "\n" + dog2.weight + "\n" + dog2.speed);
        System.out.println(dog3.breed + ":" + "\n" + dog3.name + "\n" + dog3.age + "\n" + dog3.weight + "\n" + dog3.speed);
        System.out.println(dog4.breed + ":" + "\n" + dog4.name + "\n" + dog4.age + "\n" + dog4.weight + "\n" + dog4.speed);
        System.out.println(dog5.breed + ":" + "\n" + dog5.name + "\n" + dog5.age + "\n" + dog5.weight + "\n" + dog5.speed);

    }
}
