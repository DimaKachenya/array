package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        int[] my_arr=new int [n];


        for(int i=0;i<n;i++)
            my_arr[i]=in.nextInt();

        for(int i=0;i<n;i++)
            if(my_arr[i]>i+1)
                System.out.print(my_arr[i]+" ");



    }
}
