package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner myscanner = new Scanner(System.in);
            int numerator = myscanner.nextInt();
            int divisor = myscanner.nextInt();
            int n = myscanner.nextInt();
            long numerator1 = (long)(numerator * (Math.pow(10, n)));
            System.out.println(numerator1);
            long answer = (decimal(numerator1,divisor));
            System.out.println(answer);
            System.out.println(answer%10);
        }

    // recursive method
    public static long decimal(long numerator, int divisor){
            if (numerator < divisor) {
                return 0;
            }
            if((numerator/divisor)>10_000_000) {
                return 10_000_000 + decimal((numerator - (divisor * 10_000_000)),divisor);
            }
            if((numerator/divisor)>1_000_000) {
                return 1_000_000 + decimal((numerator - (divisor * 1_000_000)),divisor);
            }
            if((numerator/divisor)>100_000) {
                return 100_000 + decimal((numerator - (divisor * 100_000)),divisor);
            }
            if((numerator/divisor)>10_000) {
                return 10_000 + decimal((numerator - (divisor * 10_000)),divisor);
            }
            if((numerator/divisor)>1000) {
                return 1000 + decimal((numerator - (divisor * 1000)),divisor);
            }
            if((numerator/divisor)>100) {
                return 100 + decimal((numerator - (divisor * 100)),divisor);
            }
            if((numerator/divisor)>50) {
                return 50 + decimal((numerator - (divisor * 50)),divisor);
            }
            if((numerator/divisor)>10) {
                return 10 + decimal((numerator - (divisor * 10)),divisor);
            }
            else {
                return 1 + decimal((numerator - divisor), divisor);
            }
    }
}