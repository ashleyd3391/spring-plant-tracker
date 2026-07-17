package com.example.spring_plant_tracker.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate lastWateredDate;

    public Plant(){}

    public Plant(Long id, String name, LocalDate lastWateredDate) {
        this.id = id;
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
