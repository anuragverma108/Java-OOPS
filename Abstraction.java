abstract class Animal{
    int weight;

    abstract  void walk();
    public void eats(){
        System.out.println("Animal eats");
    }

    Animal(){
        System.out.println("Animal is Created");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }

}

class Chicken extends Animal{

    public void walk(){
        System.out.println("walk on 2 legs");
    }

    Chicken(){
        System.out.println("Chicken is created");
    }
}



public class Abstraction {
    public static void main(String[] args){
        Chicken c1 = new Chicken();
        c1.weight = 50;

        c1.walk();
        System.out.println(c1.weight);

        c1.eats();

    }
}
