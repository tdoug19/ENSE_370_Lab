public class CoffeeMaker {

    public double coffeeCost = 1.00;
    public double milkCost = 0.5;
    public double frothedMilkCost = 0.75;
    public double sugarCost = 0.5;
    public double syrupCost = 0.25;

    public void dripBrew(int coffee, int milk, int sugar)
    {
        System.out.println("Drip Brew a black Coffee");
        System.out.println("Cost is: " + ((coffeeCost*coffee) + (milkCost*milk) + (sugarCost*sugar)));
    };


    public  void pourOver(int coffee, int milk, int sugar){

        System.out.println("Creating a Pour Over Coffee");
        System.out.println("Cost is: " + ((coffeeCost*coffee) + (milkCost*milk) + (sugarCost*sugar)));

    }
    
    public  void coldBrew(int coffee, int milk, int syrup){
        System.out.println("Creating a Cold Brew Coffee");
        System.out.println("Cost is: " + ((coffeeCost*coffee) + (milkCost*milk) + (syrupCost*syrup)));
    }

    public  void expresso(int coffee, int milk, int syrup){
        System.out.println("Creating an Expresso Coffee");
        System.out.println("Cost is: " + ((coffeeCost*coffee) + (milkCost*milk) + (syrupCost*syrup)));

    }

    public void ristretto(int coffee, int milk, int frothedMilk, int syrup){
        System.out.println("Creating a Ristretto");
        System.out.println("Cost is: " + ((coffeeCost*coffee) + (milkCost*milk) + (frothedMilkCost*frothedMilk) + (syrupCost*syrup)));

    }
}
