# ENSE 370 Lab  
## Redesign and Refactoring  

**Author:** Trevor Douglas  
**Software Systems Lab Instructor**  
**University of Regina**  

## Procedure  
You have been employed at the "Best Cup of Coffee" Company. They provide coffee makers and have software simulating functionality. Given the code on URCourses, you are to redesign this code and improve it. Originally, the company was small and created a coffee maker like so:

```java
public class BlackAndDecker {

  public double coffeeCost = 1.00;
  public double milk = 0.25;
  public double sugar = 0.25;

  public void dripBrew(int coffeeAmount, int milkAmount, int sugarAmount) {
      System.out.println("Drip Brew a Coffee");
      System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (sugarCost * sugar)));
  }
}
```

The original coffee maker was a basic drip brew and could provide basic coffee with milk and sugar. Over time, the company acquired a Breville coffee maker that could make other beverages such as espressos. The developers used inheritance to try to simulate the new coffee maker and functionality. This seemed to work in the short term; however, management has indicated they would like to add a new Phillips Latte coffee maker that could make more complicated recipes. In the end, the following coffee makers and ingredients were decided on.

### Black and Decker  
The Black and Decker coffee maker has the following ingredients:
- coffee  
- milk  
- sugar  

It is able to brew:  
**A traditional coffee.**  
```java
public void dripBrew(int coffee, int milk, int sugar);
```

### Breville  
The Breville coffee maker has the following ingredients:
- coffee  
- milk  
- sugar  
- syrup  

It has the following brewing styles:

**A traditional coffee**  
```java
public void dripBrew(int coffee, int milk, int sugar);
```

**A pour over.** This brewing style is achieved by pouring boiling water slowly through coffee grounds as they sit in a filter basket. The coffee then drips into a single cup, resulting in a potent brew.  
```java
public void pourOver(int coffee, int milk, int sugar);
```

**A cold brew.** For cold brew, coarsely ground coffee is placed in room temperature water and allowed to steep for an extended period of time. This results in a less bitter, highly caffeinated brew.  
```java
public void coldBrew(int coffee, int milk, int syrup);
```

**An espresso.** To achieve an espresso brew, you'll need an espresso or cappuccino machine. These machines pass pressurized hot water through a filter containing dark roasted finely ground coffee beans. The force of the water produces a highly concentrated coffee shot.  
```java
public void espresso(int coffee, int milk, int syrup);
```

### Phillips  
The Phillips coffee maker has the following ingredients:
- coffee  
- milk  
- sugar  
- syrup  
- frothed milk  

It can perform all the brewing styles that the Breville can plus the following:

**A Ristretto coffee.** Brewed in a similar method to the espresso, pressurized water is passed through the coffee grounds. However, you would use half the amount of water. The shorter brewing cycle creates a more concentrated and darker shot of espresso.  
```java
public void ristretto(int coffee, int milk, int frothedMilk, int syrup);
```

### The Inheritance Solution  
The solution continued to grow to this:

```java
public class CoffeeMaker {

    public double coffeeCost = 1.00;
    public double milkCost = 0.5;
    public double frothedMilkCost = 0.75;
    public double sugarCost = 0.5;
    public double syrupCost = 0.25;

    public void dripBrew(int coffee, int milk, int sugar) {
        System.out.println("Drip Brew a black Coffee");
        System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (sugarCost * sugar)));
    }

    public void pourOver(int coffee, int milk, int sugar) {
        System.out.println("Creating a Pour Over Coffee");
        System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (sugarCost * sugar)));
    }

    public void coldBrew(int coffee, int milk, int syrup) {
        System.out.println("Creating a Cold Brew Coffee");
        System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (syrupCost * syrup)));
    }

    public void espresso(int coffee, int milk, int syrup) {
        System.out.println("Creating an Espresso Coffee");
        System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (syrupCost * syrup)));
    }

    public void ristretto(int coffee, int milk, int frothedMilk, int syrup) {
        System.out.println("Creating a Ristretto");
        System.out.println("Cost is: " + ((coffeeCost * coffee) + (milkCost * milk) + (frothedMilkCost * frothedMilk) + (syrupCost * syrup)));
    }
}
```

## Code Problems  
Clearly, there are issues with this design going forward. Is this design "Open" to change or "Closed" meaning that the code works and it should be left alone? What about other "Code Smells":
- **Bloaters** - Code, Methods, and Classes have increased and are getting hard to deal with.
- **Change Preventers** - How hard is it to change?
- **Object-Oriented Abusers** - Breaking object-oriented programming principles.

In fact, there is a rumor about another coffee maker coming online that contains chocolate to make Mocha beverages.

## Requirements  
Redesign this software solution using OO design principles and any Software Patterns you think are applicable to remove these smells and make our code open to change.

The following requirements are listed:
- Write a small document detailing the changes to the design and how it improves the code.
- Create a class diagram for your code.
- Submit your code on Snoopy and your UML documentation to URCourses.

