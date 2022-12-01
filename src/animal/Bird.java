package animal;

class Bird extends Animal{
    String featherColor;

    String typ;
    public String getFeatherColor(){
        return typ;
    }



    public Bird(String name, int age, int weight, String featherColor, String typ) {
        super(name, age, weight);
        this.featherColor = featherColor;
        this.typ = typ;
    }


}


