package com.testGithub;

public class Main {

    public static void main(String[] args) {

        int trois = 3;

        System.out.println("Hello conflict");
        System.out.println("fludublu");
        System.out.println(trois);

        for(int i = 1; i <= 10; i++)
        {

            trois = trois + i;
        }
        System.out.println(trois);


        for(int i = 1; i <= 10; i++)
        {

            trois += i * i;
            System.out.println(trois);
        }

        System.out.println("testpullgithub");
    }
}


