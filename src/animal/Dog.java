package animal;

class Dog extends  Mammal{
    String Kliczka;


    String typ;



    public String getKpecies(){
        return typ;
    }

    public Dog(String name, int age, int weight, String klass, String typ, String kliczka, String nazwisko) {
        super(name, age, weight, klass, typ);
        Kliczka = kliczka;

    }



    @Override
    public void move() {
        System.out.println("Dog runs on four legs");
    }
}
