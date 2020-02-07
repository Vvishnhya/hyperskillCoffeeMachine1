import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        // put your code here

        int n;
        int b;

        Scanner scr = new Scanner(System.in);

        boolean ascend = true;
        boolean ascend2 = true;
        int count = 0;

        n = scr.nextInt();
        b = n;
        count++;
        n = scr.nextInt();


        if (n != 0 && n >= b) {
            b = n;
            count++;
            while (n != 0) {
                n = scr.nextInt();

                if (n >= b) {
                    ascend = true;
                    count++;
                    b = n;
                } else if (n == 0) {
                    break;
                } else if (n < b && count > 1 && n != 0) {
                    ascend2 = false;
                    count++;
                    b = n;


                }
            }
        } else if (n != 0 && n <= b) {
            b = n;
            count++;
            while (n != 0) {
                n = scr.nextInt();
                if (n <= b && n != 0) {
                    ascend = true;
                    count++;
                    b = n;
                } else if (n == 0) {
                    break;
                } else if (n > b && count > 1) {
                    ascend2 = false;
                    b = n;

                }
            }
        }

//        while (n != 0 && n >= b){
//            n = scr.nextInt();
//            if(n >= b){
//                ascend = true;
//                count++;
//            }else if (n == 0) {
//                break;
//            }else if (n < b){
//                ascend = false;
//                count++;
//            }
//        }
            if (ascend && ascend2) {
                System.out.println("true");

            } else {
                System.out.println("false");

            }
        }
    }
