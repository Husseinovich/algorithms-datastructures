package com.datastructures.examples;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class Country {
    private String continent;
    private int poplulation;

    public Country(String continent, int poplulation) {
        this.continent = continent;
        this.poplulation = poplulation;
    }

    public String getContinent(){
        return this.continent;
    }

    public int getPopulation() {
        return this.poplulation;
    }
}
