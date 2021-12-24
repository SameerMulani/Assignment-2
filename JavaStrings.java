package com.myjava;
import java.util.Scanner;

//JAVA STRINGS:

public class JavaStrings {
    public static void main(String[] args){
        //1. Reversing a string:
//        String st = "Sameer";
//        String reversedStr = "";
//
//        //Iterate through the string from last and add each character to variable reversedStr
//        for(int i = st.length()-1; i >= 0; i--){
//            reversedStr = reversedStr + st.charAt(i);
//        }
//        //Displays the reverse of given string
//        System.out.println("Reverse of given string: " + reversedStr);

        //2. Finding the subsets of a string:
//        String str = "ANDROID";
//        int len = str.length();
//        int temp = 0;
//
//        String arr[] = new String[len*(len+1)/2];    //Total possible subsets for string of size n is n*(n+1)/2
//
//        for(int i = 0; i < len; i++) {
//            for(int j = i; j < len; j++) {
//                arr[temp] = str.substring(i, j+1);
//                temp++;
//            }
//        }
//        System.out.println("All subsets for given string are: ");
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);                 //it will print all the subsets stored in arr
//        }

        //3. Total number of characters in the string:
//        String string = "Android App Development Assignment";
//        int count = 0;
//
//        //Counts each character except space
//        for(int i =0;i < string.length();i++) {
//            if(string.charAt(i) != ' ')
//                count++;
//        }
//        System.out.println("Total number of characters in a string: " + count);
    }
}
