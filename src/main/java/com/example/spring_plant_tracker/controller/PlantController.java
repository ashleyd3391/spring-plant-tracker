package com.example.spring_plant_tracker.controller;
import com.example.spring_plant_tracker.model.Plant;
import com.example.spring_plant_tracker.service.PlantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PlantController {
    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/plants")
    public List<Plant> getPlants(){
        return plantService.getAllPlants();
    }

    @PostMapping("/plants")
    public Plant addPlant(@RequestBody Plant plant){
        return plantService.addPlant(plant.getName(), plant.getLastWateredDate());
    }

    @DeleteMapping("/plants/{id}")
    public void deletePlant(@PathVariable Long id){
        plantService.removePlant(id);
    }
}

