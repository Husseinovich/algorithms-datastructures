package com.datastructures.examples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class Test {

    public static void main (String [] args){
        LambdaExpressions expressions = new LambdaExpressions();
        List<Country> countries = new ArrayList<>(5);
        Country country1 = new Country("Africa", 18000000);
        Country country2 = new Country("Africa", 18000000);
        Country country3 = new Country("Asia", 18000000);
        Country country4 = new Country("Africa", 18000000);
        Country country5 = new Country("America", 18000000);
        Country country6 = new Country("Africa", 18000000);
        Country country7 = new Country("Africa", 18000000);
        Country country8 = new Country("Europe", 18000000);
        Country country9 = new Country("Africa", 18000000);
        Country country10 = new Country("Asia", 18000000);
        Country country11 = new Country("Asia", 18000000);


        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);
        countries.add(country8);
        countries.add(country9);
        countries.add(country10);
        countries.add(country11);
        

        System.out.println("Total African Population =  " + expressions.getPopulation(countries, "Africa"));

        System.out.println("Total African Population =  " + expressions.getPopulationLambda(countries, "Asia"));

     int [] a = new int [] { 1,2,3,4,5};
     int target = 9;
     int [] res = twoSum(a, target);
     System.out.println(Arrays.toString(res));
    }


    public static int []twoSum(int []a, int target){
        int [] res = new int[2];
        for (int i = 0 ; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if ( a[i] + a[j]  == target){
                    res[0] = i;
                    res[1]  = j;
                }
            }

        }
        return res;
    }






}
