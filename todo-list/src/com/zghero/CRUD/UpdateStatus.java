package com.zghero.CRUD;

import java.util.Scanner;

public class UpdateStatus {
    static Scanner input = new Scanner(System.in);

    public static void updateStatus(){
        System.out.println("1 - A FAZER");
        System.out.println("2 - FAZENDO");
        System.out.println("3 - FEITO");
        int i = input.nextInt();
    }
}
