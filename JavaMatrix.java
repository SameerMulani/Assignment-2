package com.myjava;
import java.util.Scanner;

//JAVA MATRIX:
//Not so confident with matrix in java, that's why i have written only one code

public class JavaMatrix {
    public static void main(String[] args){
       // 1. Creating and printing a matrix:
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int rows = inp.nextInt();
        System.out.println("Enter no.of columns: ");
        int cols = inp.nextInt();
        int[][] mat = new int[10][10];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter element:");
                int num= inp.nextInt();
                mat[i][j]=num;
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }


    }
}
