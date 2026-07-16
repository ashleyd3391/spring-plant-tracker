package com.example.spring_plant_tracker.service;
import com.example.spring_plant_tracker.model.Plant;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PlantService {
    private final List<Plant> plants = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    public Plant addPlant(String name, LocalDate lastWateredDate){
        Long id = idCounter.incrementAndGet();
        Plant plant = new Plant(id, name, lastWateredDate);
        plants.add(plant);
        return plant;
    }

    public List<Plant> getAllPlants(){
        return plants;
    }

    public void removePlant(Long id) {
        plants.removeIf(plant -> plant.getId().equals(id));
    }
}
