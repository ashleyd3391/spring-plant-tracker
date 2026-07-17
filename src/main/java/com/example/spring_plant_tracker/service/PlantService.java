package com.example.spring_plant_tracker.service;
import com.example.spring_plant_tracker.model.Plant;
import com.example.spring_plant_tracker.repository.PlantRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant addPlant(String name, LocalDate lastWateredDate){
        Plant plant = new Plant(null, name, lastWateredDate);
        return plantRepository.save(plant);
    }

    public List<Plant> getAllPlants(){
        return plantRepository.findAll();
    }

    public void removePlant(Long id) {
        plantRepository.deleteById(id);
    }

    public void changePlant(Long id, Plant plant) {
       Plant plantEntry = plantRepository.findById(id).orElse(null);
       if (plantEntry != null){
           plantEntry.setName(plant.getName());
           plantEntry.setLastWateredDate(plant.getLastWateredDate());
           plantRepository.save(plantEntry);
       }
    }
}
