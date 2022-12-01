package animal;

import animal.Interfaces.AnimalBehavior;
import animal.Interfaces.AnimalMove;
import animal.Interfaces.AnimalName;

public abstract class Animal implements AnimalBehavior, AnimalMove, AnimalName {
    protected String name;
    protected int age;
    protected int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    void eat() {
    }

    void getVoice() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {
        System.out.println(name);
    }


}
