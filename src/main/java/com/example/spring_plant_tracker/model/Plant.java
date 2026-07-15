package com.example.spring_plant_tracker.model;
import java.time.LocalDate;

public class Plant {
    private Long id;
    private String name;
    private LocalDate lastWateredDate;


    public Plant(String name, LocalDate lastWateredDate) {
        this.name = name;
        this.lastWateredDate = lastWateredDate;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public LocalDate getLastWateredDate(){
        return lastWateredDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastWateredDate(LocalDate lastWateredDate){
        this.lastWateredDate = lastWateredDate;
    }
}
