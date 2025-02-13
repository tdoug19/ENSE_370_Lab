## ENSE 370 - Software System Design - Laboratory

# Lab 3: Factory Design Pattern
### University of Regina
### Faculty of Engineering and Applied Science - Software Systems Engineering

### Lab Instructor: [Trevor Douglas](mailto:trevor.douglas@uregina.ca)

## Background
 
The **Factory Design Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It helps promote loose coupling and enhances code maintainability.

## When to Use the Factory Pattern
- When the exact type of object to be created is determined by runtime logic.
- When object creation is complex or involves multiple steps.
- When a class should not be responsible for instantiating its objects directly.
- When creating multiple related objects with slight variations.

## Structure of the Factory Pattern
The Factory Pattern typically consists of the following components:
1. **Product (Interface/Abstract Class)** - Defines the interface of objects created by the factory.
2. **Concrete Product** - Implements the product interface.
3. **Factory Class** - Contains a method to create objects based on input conditions.
4. **Client** - Calls the factory method instead of directly instantiating objects.

```mermaid
classDiagram
    direction LR
    class EnemyShip~abstract~ {
        - name: String
        - amtDamage: double
        +followHeroShip(): void
        +displayEnemyShip(): void
    }
    class UFOEnemyShip {
        +setName(String): void
    }
    class RocketEnemyShip {
        +setName(String): void
    }
    class EnemyShipFactory~factory~{
        + makeEnemyShip(String)
    }
    class Client {
        
    }

    Client --> EnemyShipFactory
    EnemyShipFactory ..> EnemyShip
    UFOEnemyShip --|> EnemyShip
    RocketEnemyShip --|> EnemyShip 

```





## Example Implementation



## Advantages of Factory Pattern
- **Encapsulation of Object Creation**: The creation logic is moved to the factory, reducing dependencies in the client code.
- **Code Maintainability**: New product types can be added without modifying existing client code.
- **Improved Scalability**: Easy to extend by adding new product types without modifying factory logic significantly.
- **Loose Coupling**: The client code depends on abstractions rather than specific implementations.

## Disadvantages
- **Increased Complexity**: Additional classes and interfaces may increase complexity.
- **Limited to a Single Factory Class**: In some cases, having a single factory class might become a bottleneck.

## Conclusion
The **Factory Design Pattern** is a powerful creational pattern that enhances modularity, scalability, and flexibility in software design. It is widely used in frameworks and libraries where object creation needs to be abstracted and controlled. By using factories, you can decouple the client code from the object creation process, making your application easier to maintain and extend.

---
Would you like a real-world example using another language like Python or JavaScript?

