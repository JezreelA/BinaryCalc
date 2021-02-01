package binarycalc;

import java.util.Scanner;

public class BinaryCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int userNum = input.nextInt();

        System.out.println(userNum + " in binary is:");

        int container[] = new int[100];

        int i = 0;

        while (userNum > 0) {
            container[i] = userNum % 2;
            i++;
            userNum = userNum / 2;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(container[j]);
        }
    }

}
