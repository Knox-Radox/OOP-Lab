abstract class Shape {
    abstract double area(); 

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

abstract class ShapeFactory {
    abstract Shape createShape(String type, double... params);
}

public class AbstractClasses_1 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory() {
            Shape createShape(String type, double... params) {
                switch (type.toLowerCase()) {
                    case "circle":
                        return new Circle(params[0]);
                    case "rectangle":
                        return new Rectangle(params[0], params[1]);
                    case "triangle":
                        return new Triangle(params[0], params[1]);
                    default:
                        throw new IllegalArgumentException("Unknown shape: " + type);
                }
            }
        };

        Shape circle = factory.createShape("circle", 5);
        Shape rectangle = factory.createShape("rectangle", 4, 6);
        Shape triangle = factory.createShape("triangle", 3, 8);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
