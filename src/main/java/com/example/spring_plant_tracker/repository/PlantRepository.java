package com.example.spring_plant_tracker.repository;
import com.example.spring_plant_tracker.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlantRepository extends JpaRepository<Plant, Long> {
}
