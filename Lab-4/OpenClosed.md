# **Open/Closed Principle (OCP) in Software Design**

## **Definition**
The **Open/Closed Principle (OCP)** is one of the **SOLID** principles of object-oriented design. It states that:

> **"Software entities (such as classes, modules, and functions) should be open for extension, but closed for modification."**

### **What does this mean?**
- **Open for extension** → You should be able to add new functionality without changing the existing code.
- **Closed for modification** → Once a class is implemented and tested, it should not be modified when new requirements come up. Instead, changes should be made by extending the existing code.

This principle helps **reduce bugs** and makes the code **more maintainable** by avoiding modifications to tested and working code.

---

## **Example of Open/Closed Principle**

### **Bad Example (Violates OCP)**
In this case, every time a new shape is added, we need to modify the `AreaCalculator` class, which violates OCP.

```java
class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Violates OCP: New shapes require modifying this class
class AreaCalculator {
    public double calculate(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getArea();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return circle.getArea();
        }
        return 0;
    }
}