class Student{
    int age;
    String name;
    static String School;

    public static void changeSchool(String newSchool) {
        School = newSchool;
    }
}




public class Static_Keyword {

    public static void main(String[] args){
    Student.School = "MVM";


    Student s1 = new Student();
    System.out.println(s1.School);

    Student.changeSchool("BCS");
    System.out.println(s1.School);
}
}
