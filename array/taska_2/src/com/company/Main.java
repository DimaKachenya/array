package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        int[] my_arr=new int[n];
        for (int i=0;i<n;i++)
        {
            my_arr[i]=  in.nextInt();
        }
        int Z=in.nextInt();
        int counter=0;
        for(int i=0;i<n;i++)
        {
            if(my_arr[i]>Z)
            {
                my_arr[i]=Z;
                counter++;
            }

        }
        for (int i=0;i<n;i++)
        {
           System.out.print(my_arr[i]+" ");
        }

        System.out.println("\n"+counter);

    }
}
