import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scr = new Scanner(System.in);
        int a;
        int sum = 0;
        a = scr.nextInt();
        sum += a;

        while(scr.hasNextInt()){

            a = scr.nextInt();
            sum += a;
            if (a == 0){
                break;
            }

        }
        System.out.println(sum);
    }
}