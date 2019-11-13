package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        int[] my_arr=new int [n];

        for(int i=0;i<n;i++) {
            my_arr[i] = in.nextInt();
            if((i+1)%2==0)
            {
                my_arr[i]=0;
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(my_arr[i]+" ");


    }
}
