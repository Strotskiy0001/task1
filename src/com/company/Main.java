package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int a;
                int b;
                int c;
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input a");
                a = keyboard.nextInt();
                System.out.println("Input b");
                b = keyboard.nextInt();
                c = a;
                a = b;
                b = c;
                System.out.println(a + " " + b);
            }
        }


