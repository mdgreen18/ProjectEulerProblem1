package com.matthew;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplesOfThreeAndFive(1000));
    }

    public static int multiplesOfThreeAndFive(int number) {
        int sum = 0;

        for(int i = 0; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
