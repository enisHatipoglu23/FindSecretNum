package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 5;
        if(right < 1){

        }

        for(int i = 0; i <= 5; i++) {
            System.out.println("Tahmin: ");
            int selected = input.nextInt();

            if(selected < 1 || selected > 100) {
                System.out.println("0 ile 100 arasında bir sayı giriniz. ");
            }

            if(selected == number) {
                System.out.println("Doğru! Sayı: " + selected);
                break;
            }else if(selected != number) {
                System.out.println("Yanlış sayı, hakkınız azaldı. HAK: " + (right - i));
                if(selected < number) {
                    System.out.println("Girdiğiniz sayı, gizli sayıdan küçüktür. ");
                }else {
                    System.out.println("Girdiğiniz sayı, gizli sayıdan büyüktür. ");
                }
            }
            if (i == 5){
                System.out.println("Gizli sayı " + number + " idi. ");

            }
        }

    }

  
}

