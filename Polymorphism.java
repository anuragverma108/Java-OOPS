class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(age + " " + name);
    }
    public void printInfo(int age, String name){
        System.out.println(age + " " + name);
    }
    public void printInfo(int age){
        System.out.println(age );
    }
    public void printInfo(String name){
        System.out.println( name);
    }
}



public class Polymorphism {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Striver";

        
        s1.printInfo(s1.age, s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo();
    }
}
