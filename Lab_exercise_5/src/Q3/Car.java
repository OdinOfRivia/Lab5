package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Car {
    public static void main(String[] args) {
        
        List<Cars> carsList = new ArrayList<>();

    
         carsList.add(new Cars("Mercede", "SL-63", 2023));
         carsList.add(new Cars("BMW", "M4", 2020));
         carsList.add(new Cars("Audi", "RS7", 2022));
      
         Collections.sort(carsList);

        for(Cars e: carsList){
            System.out.println(e.brand + " : " +e.model + ":" + e.year);
        }

    }

}

class Cars implements Comparable <Cars>{
    String brand;
    String model;
    int year;

    public Cars(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Cars o) {
        
        return o.year - this.year;
    }

}