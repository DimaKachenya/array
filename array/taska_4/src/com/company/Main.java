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

        int min=9999999,max=0;
        int ind_max=0,ind_min=0;
        for(int i=0;i<n;i++)
        {
            if(my_arr[i]>max)
            {
                max=my_arr[i];
                ind_max=i;
            }
            else if (my_arr[i]<min)
            {
                min=my_arr[i];
                ind_min=i;
            }

        }
        int swap=max;
        my_arr[ind_max]=min;
        my_arr[ind_min]=swap;

        for(int i=0;i<n;i++)
        System.out.print(my_arr[i]+" ");








    }
}
