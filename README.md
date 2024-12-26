# Java OOPS Concepts

## Classes & Objects

```java
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name + " " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anurag";
        s1.age = 20;

        s1.printInfo();
    }
}
```

---

## Constructors

### 1. Non-Parameterized Constructor

```java
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name + " " + age);
    }

    Student(){
        System.out.println("Constructor defined by user, it will be called first when a new student object is created");
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anurag";
        s1.age = 20;

        s1.printInfo();
    }
}
```

### 2. Parameterized Constructor

```java
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name + " " + age);
    }

    Student(String Naam, int Umra){
        this.name = Naam;
        this.age = Umra;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anurag", 24);

        s1.printInfo();
    }
}
```

### 3. Copy Constructor

```java
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name + " " + age);
    }

    Student() {
        // default constructor
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 30;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
```

---

## Polymorphism

### 1. Compile Time Polymorphism (Method Overloading)

```java
class Student{
    String name;
    int age;

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 30;

        s1.printInfo(s1.name, s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
    }
}
```

---

## Inheritance

### 1. Basic Example

```java
class Shape{
    String color;
}

class Triangle extends Shape{
}

class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

        System.out.println(t1.color);
    }
}
```

### 2. Single Level Inheritance

```java
class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int height, int width){
        System.out.println(0.5 * height * width);
    }
}

class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(20, 10);
    }
}
```

### 3. Multi-Level Inheritance

```java
class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int height, int width) {
        System.out.println(0.5 * height * width);
    }
}

class EquiTriangle extends Triangle {
    public void area(int side) {
        System.out.println(0.5 * side * side);
    }
}

class Main {
    public static void main(String[] args) {
        EquiTriangle e1 = new EquiTriangle();
        e1.area(4);
    }
}
```

### 4. Hierarchical Inheritance

```java
class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int height, int width) {
        System.out.println(0.5 * height * width);
    }
}

class Circle extends Shape{
    public void area(double r){
        System.out.println((3.14) * r * r );
    }
}

class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(6.7);
    }
}
```

---

## Access Modifiers

```java
class Account{
    public String name;
    protected String email;
    private String password;

    // Getters & Setters for private access modifier
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank{
    public static void main(String[] args){
        Account a1 = new Account();
        a1.name = "SBI Naini";
        a1.email = "sbinaini@gmail.com";
        System.out.println(a1.name);

        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
```

---

## Packages

### DemoPackage.java

```java
import tools.*;

public class DemoPackage {
    public static void main(String[] args) {
        Calc c1 = new Calc();
    }
}
```

### tools/Calc.java

```java
package tools;

public class Calc {
    public static void main(String[] args) {
    }
}
```

---

## Abstraction

### Using Abstract Classes

```java
abstract class Animal{
    int weight;

    abstract void walk();

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
```

### Using Interfaces (Pure Abstraction)

```java
interface Animal{
    int eyes = 2;
    public void walks();
}

interface Herbivore{
    String type = "P";
}

class Horse implements Animal, Herbivore{
    public void walks(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walks();
        System.out.println(Herbivore.type);
    }
}
```

---

# Static Keyword in Java

The `static` keyword in Java is used for memory management and is applied to variables, methods, and blocks. When a member is declared as `static`, it belongs to the class rather than an instance of the class. 

---

## Example Code

```java
class Student {
    int age;
    String name;
    static String School;

    // Static method to change the school name
    public static void changeSchool(String newSchool) {
        School = newSchool;
    }
}

public class Static_Keyword {

    public static void main(String[] args) {
        // Setting the static variable directly through the class
        Student.School = "MVM";

        // Creating an object of Student
        Student s1 = new Student();

        // Accessing the static variable through an instance
        System.out.println(s1.School);

        // Changing the static variable using a static method
        Student.changeSchool("BCS");
        System.out.println(s1.School);
    }
}


