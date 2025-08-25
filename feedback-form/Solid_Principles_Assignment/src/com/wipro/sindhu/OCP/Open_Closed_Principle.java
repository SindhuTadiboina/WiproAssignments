package com.wipro.sindhu.OCP;

public class Open_Closed_Principle {
    public static void main(String[] args) {
        DrawingTool tool = new DrawingTool();
        tool.drawShape(new Circle());
        tool.drawShape(new Triangle());
    }
}

// Interface
interface Shape {
    void draw();
}

// Concrete Class 1
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Concrete Class 2
class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// DrawingTool class that is open for extension, closed for modification
class DrawingTool {
    public void drawShape(Shape shape) {
        shape.draw(); // Uses polymorphism
    }
}
