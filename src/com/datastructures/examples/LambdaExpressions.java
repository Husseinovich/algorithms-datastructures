package com.datastructures.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class LambdaExpressions {

    public int getPopulation(List<Country> countries, String continent) {
        int sum = 0 ;
        for (Country country : countries) {
            if (country.getContinent().equals(continent)){
                sum += country.getPopulation();
            }
        }
        return sum;
    }

    public int getPopulationLambda(List<Country> countries, String continent){
        // filter countries
        Stream <Country> sublist = countries.stream().filter(
                country -> {return country.getContinent().equals(continent);}
        );

        // Convert to list of populations
        Stream< Integer> populations = sublist.map(
                c -> c.getPopulation()
        );

        // sum list
        int population = populations.reduce(0, (a,b) -> a + b );

        return population;
    }


}
