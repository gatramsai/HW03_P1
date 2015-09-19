package com.company;

public class HW03_P1
{


    public static void main(String[] args)
    {
        int[] first50= new int[50];

        for (int num = 0,numToCheck = 0; num< 50; numToCheck++)
        {
            if(isPrime(numToCheck)) {
                first50[num] = numToCheck;
                num++;
            }
        }

        for (int num = 1; num<= 50; num++)//change the for loop so we can printthe lines in increments of 10
        {
            System.out.print(first50[num-1]+ " ");
            if(num %10==0 && num!=0 )
                System.out.print("\n");
        }
    }

    public static boolean isPrime(int number)
    {
        //only necessary to test the factors between 2 and the square root of n
        //rounded up of course
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {//make sure to make it equals to the squaare because if you ahvea a perfect aqquare like 25 it won't work
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}

/*
Analysis: The input for this program nothing from the user. The output is the first 50 prime numbers in 5 lines.

Design: A method is created to test whether a number is a prime number or not. In addition to this we create an array to hold the numbers.
When a number is deemd to be prime we add it to the array. we then print the array out in 5 lines.

Testing: Test the program by comparing the output in cosole and the specified output given to us.
 */