public class CoffeeSim {
    
    public static void main(String[] args)
    {
        CoffeeMaker cm;
        System.out.println("\nI want Coffee from the Black And Decker one milk, one sugar");
        cm = new BlackAndDecker();
        cm.dripBrew(1,1,1);
        // This is a problem as this coffee maker should not do this
        System.out.println("\nI want Coffee from the Black And Decker");
        cm.pourOver(1,1,1);


        System.out.println("\nI want Coffee from the Breville");
        cm = new Breville();
        cm.dripBrew(1,1,1);

        System.out.println("\nI want Coffee from the Breville");
        cm = new Breville();
        cm.pourOver(1,1,1);
    }

}


