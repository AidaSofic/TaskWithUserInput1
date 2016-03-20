

package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println ("Enter your number here: ");
        int i;
        int k = scan.nextInt();;
        int j;

        for (i = 1;i <= k; i++) {
            // i=1; 1<=4 ==TRUE
            // i=2; 2<=4 == TRUE
            //i = 3 3<=4 == TRUE
            //i = 4 4<=4 == TRUE
            // i=5; 5<=4 == false - out of the loop

            for (j = 1; j <= 0 + i; j++){

                //j=1; j<=0+1 == TRUE
                //j=2; j<=0+1 == false - out of the loop
                //--------
                // j=1; j<=0+2 TRUE
                // j=2; j<=0+2 TRUE
                // j=3; j<=0+2 false - out of the loop
                //------------
                //j=1; j<=0+3 TRUE
                //j=2; j<=0+3 TRUE
                //j=3; j<=0+3 TRUE
                //j=4; j<=0+3 FALSE
                //---------------------
                //j=1; j<=0+4 - TRUE
                //j=2; j<=0+4  - TRUE
                //j=3; j<=0+4  - TRUE
                //j=4; j<=0+4 - TRUE
                //j=5; j<=0+4 - false
                //-----------

                System.out.print("*");
            }


            System.out.println("");

        }


    }
}