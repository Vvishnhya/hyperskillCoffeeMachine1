import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scr = new Scanner(System.in);

        int shapeNum = scr.nextInt();

        if(shapeNum == 1){
            System.out.println("You have chosen a square");
        }else if(shapeNum == 2){
            System.out.println("You have chosen a circle");
        }else if(shapeNum == 3){
            System.out.println("You have chosen a triangle");
        }else if(shapeNum == 4){
            System.out.println("You have chosen a rhombus");
        }else{
            System.out.println("There is no such shape!");
        }



    }
}