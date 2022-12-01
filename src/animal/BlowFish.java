package animal;

class BlowFish extends Fish{
    String blowing;

    public String getBlowing(){
        return typ;
    }

    public BlowFish(String name, int age, int weight, String swim, String typ, String blowing) {
        super(name, age, weight, swim, typ);
        this.blowing = blowing;
    }



    @Override
    public void move() {
        System.out.println("boool bool bboool");
    }
}


