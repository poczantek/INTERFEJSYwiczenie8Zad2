package animal;

class Fish extends  Animal{
    String swim;
    String typ;



    public String getSwim(){
        return typ;
    }

    public Fish(String name, int age, int weight, String swim, String typ) {
        super(name, age, weight);
        this.swim = swim;
        this.typ = typ;
    }


}


