class Shape {
    String color;
    
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
        System.out.println((3.14)* r * r );
    }
}


public class Inheritance {
    public static void main(String[] args){

        Triangle t1 = new Triangle();
        t1.color = "black";
        System.out.println(t1.color);

        Circle c1 = new Circle();
        c1.area(6.7);
       
    }
}
