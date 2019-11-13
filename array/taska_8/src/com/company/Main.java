package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] my_arr=new int [n];

        for(int i=0;i<n;i++) {
            my_arr[i] = in.nextInt();
        }

        int min=my_arr[0];

        for (int i=0;i<n;i++) {
            if (my_arr[i]<min) {
                min = my_arr[i];
            }
        }

        int counter=0;
        for (int i=0;i<n;i++) {
            if (my_arr[i]==min)
             counter++;

        }
        int[] my_new_arr=new int[n-counter];
        int sost=0;
        for (int a=0;a<n-counter;a++) {
            for (int i = sost; i < n; i++) {

                if (my_arr[i] == min) {
                    continue;
                }
                else {
                    sost = i+1;
                    my_new_arr[a] = my_arr[i];
                    break;
                }


            }
            System.out.println(sost);
        }

        for (int i=0;i<(n-counter);i++) {
            System.out.print(my_new_arr[i] + " ");
        }



    }
}
