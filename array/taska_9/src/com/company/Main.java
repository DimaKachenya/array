package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[] my_arr_of_first_num=new int [n];

        for(int i=0;i<n;i++)
            my_arr_of_first_num[i]=in.nextInt();

        int[] my_arr_for_count_signatur_num=new int[n];



        for(int i=0;i<n;i++)
        {
            for(int a=0;a<n;a++)
                if(my_arr_of_first_num[i]==my_arr_of_first_num[a])
                {
                    my_arr_for_count_signatur_num[i]++;
                }

        }
        int max=my_arr_for_count_signatur_num[0];
        for(int i=0;i<n;i++)
        {
            if(max<my_arr_for_count_signatur_num[i])
                max=my_arr_for_count_signatur_num[i];
        }



        int[] my_arr_for_index=new int[n];
        int counter=0;
        for(int i=0;i<n;i++) {
            if(max==my_arr_for_count_signatur_num[i]) {
                my_arr_for_index[i]=i;
                counter++;
            }
            else
                my_arr_for_index[i]=-1;
        }

        int[] my_arr_for_max_num=new int[counter];


        for(int i=0;i<counter;i++)
        {
           for (int a=0;a<n;a++)
            {
                if(my_arr_for_index[a]!=-1)
                {
                    my_arr_for_max_num[i]=my_arr_of_first_num[my_arr_for_index[a]];
                }
            }
        }

        int min=my_arr_for_max_num[0];
        for (int i=0;i<counter;i++)
        {
            if (min>my_arr_for_max_num[i])
            {
                min=my_arr_for_max_num[i];
            }
        }
        System.out.print(min);





    }
}
