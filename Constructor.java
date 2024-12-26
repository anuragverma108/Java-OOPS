class Student{
    int age;
    
    String name;
    // Non Parametrised Constructor
    Student(){
        System.out.println("Mai Non Parameterised Constructor hu & mai object bnte hi call ho jaunga!");
    }

    // Paramterised Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    // Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
       
   
}

public class Constructor{
    public static void main(String[] args){

        Student s1 = new Student("Anurag",21);
        System.out.println(s1.name+s1.age);

        Student s2 = new Student(s1);
        System.out.println(s2.name);

        Student s3 = new Student();
        

    }

}