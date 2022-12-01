package animal;


import animal.Interfaces.AnimalBehavior;

import animal.Interfaces.AnimalName;

public class Main{
    public static void main(String[] args) {
        Animal anim[] = new Animal[6];
        anim[0] = new Mammal("Mamalych", 3, 5, "babau", "toto");
        anim[1] = new Fish("tipo ryba", 4, 15, "swimswim", "typovyj");
        anim[2] = new BlowFish("tipo drugaya ryba", 4, 15, "swimswim", "typovyj", "boom");
        anim[3] = new Dog("sobaka", 4, 15, "swimswim", "typovyj", "dfd", "dsa");
        anim[4] = new Pigeon("golubchik", 1, 20, "red", "fdsfsd", "fsdfs", "dsf");
        anim[5] = new Bird("ptichechka", 4, 15, "swimswim", "typovyj");



        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];

        animalBehavior[0] = new Dog("fdef", 4, 15, "swimswim", "typovyj", "dfd", "dsa");
        animalBehavior[1] = new Pigeon("fdsf", 1, 20, "dsf", "fdsfsd", "fsdfs", "dsf");
        animalBehavior[2] = new BlowFish("fdef", 4, 15, "swimswim", "typovyj", "boom");

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();



        for (Animal object:
             anim) {
            object.move();
        }
        for (Animal object:
             anim) {
            AnimalName.name(object.getName());
        }
    }}
