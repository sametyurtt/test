package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String cityName;
    @Column
    private int population;

    public Cities() {
    }

    public Cities(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
