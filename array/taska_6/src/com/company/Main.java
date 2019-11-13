package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();


        int[] my_arr=new int [n];

        for(int i=0;i<n;i++)
            my_arr[i]=in.nextInt();


        int sum=0;
        for(int i=0;i<n;i++) {
            for (int a = 1; a < i; a++) {

                if ((i+1) % a == 0 && (a != 1 || a != i)) {
                    sum += my_arr[i];
                    break;
                }
            }
        }



        System.out.print(sum+my_arr[0]);





    }
}
