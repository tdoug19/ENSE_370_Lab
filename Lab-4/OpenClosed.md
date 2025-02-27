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
```
## Why is this bad?
- If we add a new shape (e.g., `Triangle`), we must modify `AreaCalculator`, which violates OCP.  
- This makes the code **harder to maintain and extend**.  

---

## Good Example (Follows OCP)

To follow **OCP**, we use **polymorphism** and **interfaces** to ensure new shapes can be added **without modifying existing code**.  

```java
// Open for extension (New shapes can implement this interface)
interface Shape {
    double getArea();
}

// Different shape implementations
class Rectangle implements Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Open for extension but closed for modification
class AreaCalculator {
    public double calculate(Shape shape) {
        return shape.getArea();
    }
}

// Adding a new shape without modifying existing code
class Triangle implements Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
```

## Why is this better?
- If we add a new shape (`Triangle`), we **do not modify** `AreaCalculator`.  
- The system is **scalable and maintainable** because new functionality can be added **without altering existing code**.  

## Summary
- The **bad example** violates OCP because modifying `AreaCalculator` is required for every new shape.  
- The **good example** follows OCP by using **interfaces and polymorphism**, allowing new shapes to be added **without modifying existing code**.  
- Following **OCP** makes code **more modular, maintainable, and easier to extend** in the future.  