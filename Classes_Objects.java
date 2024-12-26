class Student{
    int age;
    String course;
    String name;

    public void printInfo(){
        System.out.println("Hi "+name+" your age is "+age+" & you are pusring course "+course);
       
    }
}


public class Classes_Objects {
    public static void main(String[] args){
        
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Anurag Verma";
        s1.course =" Btech in CSE";

        s1.printInfo();

    }
}
