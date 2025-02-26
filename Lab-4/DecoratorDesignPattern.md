## ENSE 370 - Software System Design - Laboratory

# Lab 4: Decorator Design Pattern
### University of Regina
### Faculty of Engineering and Applied Science - Software Systems Engineering

### Lab Instructor: [Trevor Douglas](mailto:trevor.douglas@uregina.ca)

## Background
# Decorator Design Pattern Tutorial

## Introduction
The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. It is often used to adhere to the **Open-Closed Principle** in object-oriented design.

## Key Concepts
- **Component:** The base interface or abstract class defining the methods.
- **Concrete Component:** The class that implements the base interface.
- **Decorator:** An abstract class that implements the base interface and has a reference to a component.
- **Concrete Decorators:** The classes that extend the decorator and add new behavior.



## Advantages
- Promotes code reusability and flexibility.
- Follows the Open-Closed Principle.
- Can be used to add functionalities dynamically without modifying existing code.

## Disadvantages
- Can lead to complex code if multiple decorators are used.
- Debugging can be more difficult due to multiple layers.

## Conclusion
The **Decorator Pattern** is a powerful way to extend functionalities dynamically. It allows the composition of different behaviors without modifying existing code, making it an essential tool in software design.

