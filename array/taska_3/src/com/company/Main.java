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
        int counter_zero=0,counter_plass=0,counter_minus=0;
        for(int i=0;i<n;i++)
        {
            if(my_arr[i]<0)
            {
             counter_minus++;
            }
            else if (my_arr[i]>0)
            {
                counter_plass++;
            }
            else
            {
                counter_zero++;
            }

        }
        System.out.println("Колличество отрицательных: "+  counter_minus++);
        System.out.println("Колличество положительных: "+  counter_plass++);
        System.out.println("Колличество нулевых: "+  counter_zero++);
    }
}
