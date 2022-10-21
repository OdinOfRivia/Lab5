package Q2;
import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.*;
import java.util.Stack;

public class Main {public static void main(String[] args) {

    int max = 50;
    int min = 1;
    int range = max - min + 1;

    int[] array = new int[10]; 


    for (int i = 0; i < 10; i++){
        int y = (int)(Math.random() * range)+ min;
        array [i] = y;
    }

    int [] newArray = new int[10];

    for (int s = 0; s < 10; s++){
        newArray[s] = array[s];
    }

    array[9]=-5;

    System.out.println(Arrays.toString(array)); 
    System.out.println(Arrays.toString(newArray));


    
}
    
}
