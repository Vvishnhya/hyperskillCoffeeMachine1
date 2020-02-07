package machine;

public class CoffeMachineModel {

//    private int numberOfCoffeeCupsToProduce;
//    private int numberOfCoffeeCupsPossibleToProduce;
    //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.

//    private final int neededIngradientsWaterPerCup = 200;
//    private final int neededIngradientsMilkPerCup = 50;
//    private final int neededIngradientsCoffeBeansPerCup = 15;

//    private int neededIngradientsWaterForThisNumberOfCups;
//    private int neededIngradientsMilkForThisNumberOfCups;
//    private int neededIngradientsCoffeBeansForThisNumberOfCups;

    private int containerIngradientsWater;
    private int containerIngradientsMilk;
    private int containerIngradientsCoffeBeans;
    private int containerIngradientsDisposableCups;

    private long containerBank;

    public CoffeMachineModel() {
    }

    public CoffeMachineModel(
            int containerIngradientsWater,
            int containerIngradientsMilk,
            int containerIngradientsCoffeBeans,
            int containerIngradientsDisposableCups,
            long containerBank) {
        this.containerIngradientsWater = containerIngradientsWater;
        this.containerIngradientsMilk = containerIngradientsMilk;
        this.containerIngradientsCoffeBeans = containerIngradientsCoffeBeans;
        this.containerIngradientsDisposableCups = containerIngradientsDisposableCups;
        this.containerBank = containerBank;
    }

    public int getContainerIngradientsWater() {
        return containerIngradientsWater;
    }

    public int getContainerIngradientsMilk() {
        return containerIngradientsMilk;
    }

    public int getContainerIngradientsCoffeBeans() {
        return containerIngradientsCoffeBeans;
    }

    public int getContainerIngradientsDisposableCups() {
        return containerIngradientsDisposableCups;
    }

    public long getContainerBank() {
        return containerBank;
    }

    public void setContainerIngradientsWater(int containerIngradientsWater) {
        this.containerIngradientsWater = containerIngradientsWater;
    }

    public void setContainerIngradientsMilk(int containerIngradientsMilk) {
        this.containerIngradientsMilk = containerIngradientsMilk;
    }

    public void setContainerIngradientsCoffeBeans(int containerIngradientsCoffeBeans) {
        this.containerIngradientsCoffeBeans = containerIngradientsCoffeBeans;
    }

    public void setContainerIngradientsDisposableCups(int containerIngradientsDisposableCups) {
        this.containerIngradientsDisposableCups = containerIngradientsDisposableCups;
    }

    public void setContainerBank(long containerBank) {
        this.containerBank = containerBank;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                containerIngradientsWater + " of water\n" +
                containerIngradientsMilk + " of milk\n" +
                containerIngradientsCoffeBeans + " of coffee beans\n" +
                containerIngradientsDisposableCups + " of disposable cups\n" +
                containerBank + " of money\n"
                ;
    }


    public CoffeMachineModel makeCoffee(CoffeMachineModel machine, int kindOfCoffee, int numberOfCoffeeCupsToMake){

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        switch (kindOfCoffee) {
            case 1:
                //espresso
                EspressoModel espresso = new EspressoModel();
                if (machine.checkIngradients(
                        machine,
                        espresso.waterPerOneCup,
                        espresso.milkPerOneCup,
                        espresso.beansPerOneCup,
                        numberOfCoffeeCupsToMake) == true) {
                    machine.setContainerIngradientsWater(containerIngradientsWater - espresso.waterPerOneCup);
                    machine.setContainerIngradientsMilk(containerIngradientsMilk - espresso.milkPerOneCup);
                    machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - espresso.beansPerOneCup);
                    machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - numberOfCoffeeCupsToMake);
                    machine.setContainerBank(containerBank + espresso.pricePerOneCup);
                    break;
                } else {
                    break;
                }
            case 2:
                //latte
                LatteModel latte = new LatteModel();
                    if (machine.checkIngradients(
                            machine,
                            latte.waterPerOneCup,
                            latte.milkPerOneCup,
                            latte.beansPerOneCup,
                            numberOfCoffeeCupsToMake) == true) {
                        machine.setContainerIngradientsWater(containerIngradientsWater - latte.waterPerOneCup);
                        machine.setContainerIngradientsMilk(containerIngradientsMilk - latte.milkPerOneCup);
                        machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - latte.beansPerOneCup);
                        machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - numberOfCoffeeCupsToMake);
                        machine.setContainerBank(containerBank + latte.pricePerOneCup);
                        break;
                    } else {
                    break;
                    }
            case 3:
                //cappucino
                CappucinoModel cappucino = new CappucinoModel();
                    if (machine.checkIngradients(
                            machine,
                            cappucino.waterPerOneCup,
                            cappucino.milkPerOneCup,
                            cappucino.beansPerOneCup,
                            numberOfCoffeeCupsToMake) == true) {
                        machine.setContainerIngradientsWater(containerIngradientsWater - cappucino.waterPerOneCup);
                        machine.setContainerIngradientsMilk(containerIngradientsMilk - cappucino.milkPerOneCup);
                        machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - cappucino.beansPerOneCup);
                        machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - numberOfCoffeeCupsToMake);
                        machine.setContainerBank(containerBank + cappucino.pricePerOneCup);
                        break;
                    } else {
                        break;
                    }
            }
        return machine;
    }
//
//    private int checkIfEnoughIngradients(CoffeMachineModel machine, int kindOfCoffee, int numberOfCoffeeCupsToMake){
//
//        int numberOfCoffeeCupsPossibleToProduce = 0;
//
//        machine = new CoffeMachineModel(
//                getContainerIngradientsWater(),
//                getContainerIngradientsMilk(),
//                getContainerIngradientsCoffeBeans(),
//                getContainerIngradientsDisposableCups(),
//                getContainerBank());
//
//
//
//
//
//        return numberOfCoffeeCupsPossibleToProduce;
//    }


    public CoffeMachineModel fillCoffeeMachine(CoffeMachineModel machine, int addWater, int addMilk, int addBeans, int addCups) {

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        machine.setContainerIngradientsWater(containerIngradientsWater + addWater);
        machine.setContainerIngradientsMilk(containerIngradientsMilk + addMilk);
        machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans + addBeans);
        machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups + addCups);

        return machine;
    }

    public CoffeMachineModel takeCoffeeMachine(CoffeMachineModel machine){

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        System.out.println("I give you $" + containerBank);

        machine.setContainerBank(0);

        return machine;
    }

    private boolean checkIngradients (CoffeMachineModel machine, int neededWater, int neededMilk, int neededBeans, int neededCups) {

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        if (neededMilk != 0) {

            int maximumCups = Math.min((Math.min(
                    Math.min(machine.getContainerIngradientsWater() / (neededWater * neededCups),
                            machine.getContainerIngradientsMilk() / (neededMilk * neededCups)),
                    machine.getContainerIngradientsCoffeBeans() / (neededBeans * neededCups))),
                    machine.getContainerIngradientsDisposableCups() / neededCups);

//           System.out.println("maximum Cups :" + maximumCups);
//
            if (maximumCups <= machine.getContainerIngradientsDisposableCups() && maximumCups != 0) {
                System.out.println("I have enough resources, making you a coffee!");
//        } else if (maximumCups > machine.getContainerIngradientsDisposableCups()) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (maximumCups - machine.getContainerIngradientsDisposableCups()) + " more than that)");
                return true;
            } else {
                if ((neededWater * neededCups) > machine.getContainerIngradientsWater()) {
                    System.out.println("Sorry, not enough water!");
                } else if ((neededMilk * neededCups) > machine.getContainerIngradientsMilk()) {
                    System.out.println("Sorry, not enough milk!");
                } else if ((neededBeans * neededCups) > machine.getContainerIngradientsCoffeBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                return false;
            }
        } else {

            int maximumCups = Math.min(
                    Math.min(machine.getContainerIngradientsWater() / (neededWater * neededCups),
                            machine.getContainerIngradientsCoffeBeans() / (neededBeans * neededCups)),
                    machine.getContainerIngradientsDisposableCups() / neededCups);

//            System.out.println("maximum Cups :" + maximumCups);

            if (maximumCups <= machine.getContainerIngradientsDisposableCups() && maximumCups != 0) {
                System.out.println("I have enough resources, making you a coffee!");
//        } else if (maximumCups > machine.getContainerIngradientsDisposableCups()) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (maximumCups - machine.getContainerIngradientsDisposableCups()) + " more than that)");
                return true;
            } else {
                if ((neededWater * neededCups) > machine.getContainerIngradientsWater()) {
                    System.out.println("Sorry, not enough water!");
                } else if ((neededMilk * neededCups) > machine.getContainerIngradientsMilk()) {
                    System.out.println("Sorry, not enough milk!");
                } else if ((neededBeans * neededCups) > machine.getContainerIngradientsCoffeBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                return false;
            }
        }
    }


}