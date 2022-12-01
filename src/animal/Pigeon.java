package animal;

class Pigeon extends Bird {
    String species;

String typ;
public String getSpecies(){
    return typ;
}

    public Pigeon(String name, int age, int weight, String featherColor, String typ, String species, String typ1) {
        super(name, age, weight, featherColor, typ);
        this.species = species;
        this.typ = typ1;
    }



    @Override
    public void move() {
        System.out.println("chiric chirik kurlik");
    }
}
