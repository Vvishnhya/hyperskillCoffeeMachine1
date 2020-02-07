package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        String action;
        String actionBuy;

        int numberOfCoffeeCupsToMake;
        int kindOfCoffee;

        Scanner scr = new Scanner(System.in);

        CoffeMachineModel express = new CoffeMachineModel(400, 540, 120, 9, 550);
        EspressoModel espresso = new EspressoModel();

        System.out.println(express);

        System.out.println("\n");

        action = "go!";


        while (!action.equals("exit")) {

            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            System.out.print("> ");

            action = scr.next();


            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    System.out.print("> ");

                    actionBuy = scr.next();
//                    System.out.println(actionBuy);
//                    System.out.println(actionBuy.charAt(0));

                    if(actionBuy.charAt(0) == '1' || actionBuy.charAt(0) == '2' || actionBuy.charAt(0) == '3') {



                        kindOfCoffee =  Integer.valueOf(actionBuy);
//                        kindOfCoffee = actionBuy;
                        numberOfCoffeeCupsToMake = 1;

                        express = express.makeCoffee(express, kindOfCoffee, numberOfCoffeeCupsToMake);


                    }else if(actionBuy.equals("back")){
                        break;
                    }

                    break;


                case "fill":

                    System.out.println("Write how many ml of water do you want to add:");
                    System.out.print("> ");
                    int workersWater = scr.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    System.out.print("> ");
                    int workersMilk = scr.nextInt();
                    System.out.println("Write how many grams of coffee beans the coffee do you want to add:");
                    System.out.print("> ");
                    int workersBean = scr.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    System.out.print("> ");
                    int workersCups = scr.nextInt();

                    express = express.fillCoffeeMachine(express, workersWater, workersMilk, workersBean, workersCups);

                    break;

                case "take":
                    express = express.takeCoffeeMachine(express);

                    break;

                case "remaining":
                    System.out.println("");
                    System.out.println(express);
                    break;

            }
//
//        System.out.println("");
//        System.out.println(express);

        }

    }
}