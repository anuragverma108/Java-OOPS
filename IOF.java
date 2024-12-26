import java.util.Scanner;

public class IOF {

    public static void greet(){
        System.out.println("Good Morning");
    
    }
    
    public static int sum(int a , int b){
        int sum = a+b;
         return sum;
    }
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is "+ name);


         System.out.println("Enter your Address:");
         String address = sc.nextLine(); 
 
         System.out.println("Enter your age:");
         int age = sc.nextInt(); 
         System.out.println("Enter your height:");
         double height = sc.nextDouble(); 
 
         System.out.println("Are you a student? (true/false):");
         boolean isStudent = sc.nextBoolean(); 
 
       
         System.out.println("Name: " + name);
         System.out.println("Address: " + address);
         System.out.println("Age: " + age);
         System.out.println("Height: " + height);
         System.out.println("Is a Student: " + isStudent);
 
        greet();
        int s = sum(10,20);
        System.out.println(s);
    }
}
