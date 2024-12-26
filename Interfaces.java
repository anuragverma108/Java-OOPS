// Pure Abstracion using Interface

interface Animal{
   int eyes = 2;
   public void walks();
}

interface Herbivore{
    String type =  "P";
}

class Horse implements Animal, Herbivore{               // This is Multiple Inheritance
    public void walks(){
        System.out.println("Walks on 4 legs");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walks();
        System.out.println(h1.type);
    }
}
