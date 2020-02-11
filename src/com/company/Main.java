package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width:");
        int TreeWidth = scan.nextInt();

        int space_between = 0;
        int space = TreeWidth;

        for (int i = 0; i < TreeWidth; i++) {
            if (i > 1) space_between += 2;
            if (i < 1) space_between += 1;


            if (i < TreeWidth - 1) {
                space--;

                for (int l = 0; l < space; l++) {
                    System.out.print(" ");
                }

            }


            System.out.print("*");


            if (i > 0 & i < TreeWidth - 1) {
                for (int k = 0; k < space_between; k++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }


            if (i == TreeWidth - 1) {
                for (int y = 0; y < TreeWidth - 1; y++) {
                    System.out.print(" *");
                }
            }


            System.out.println();
        }
    }
}