import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        Main main = new Main();
        int result = n;

        main.Collatzconjecture(n);
//        System.out.println(result);
//        while(result > 1){
//        if(result%2 == 0){
//
//                result = result/2;
//                System.out.println(result);
//
//        }else{
//
//                result = result*3+1;
//                System.out.println(result);
//            }
//        }

    }


public void Collatzconjecture(int result){
    System.out.println(result);
    while(result > 1){
        if(result%2 == 0){

            result = result/2;

        }else{

            result = result*3+1;
        }
        System.out.println(result);
    }

}
}