package animal;

class Mammal extends Animal{
    String klass;

    String typ;
    public String getKlass(){
        return typ;
    }

    public Mammal(String name, int age, int weight, String klass, String typ) {
        super(name, age, weight);
        this.klass = klass;
        this.typ = typ;
    }




}
