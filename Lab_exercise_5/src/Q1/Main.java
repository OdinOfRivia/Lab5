package Q1;

import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class Main {
    

    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int range = max - min + 1;
        int [] ArrayList = new int[10];
           
    
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 10; x++){
            int y = (int)(Math.random() * range)+ min;
            ArrayList [x] = y;
        }
     
        
        
        int temp;
        
        for(int i = 0; i < ArrayList.length; i++){
            for(int j = i; j < ArrayList.length; j++){
                if(ArrayList[i] > ArrayList[j]){
                    temp = ArrayList[i];
                    ArrayList[i] = ArrayList[j];
                    ArrayList[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(ArrayList));

       System.out.println("Enter a integer:");
       int inputscan = input.nextInt(); 


       int searchForIndex = Arrays.binarySearch(ArrayList,inputscan);

        if (searchForIndex<0){
        System.out.println("The number is not on the list");

         } else {
        System.out.println("The number is on the list");

       }

     }

        
}
