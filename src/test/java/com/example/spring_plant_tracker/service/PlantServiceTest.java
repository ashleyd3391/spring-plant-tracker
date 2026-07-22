package com.example.spring_plant_tracker.service;

import com.example.spring_plant_tracker.model.Plant;
import com.example.spring_plant_tracker.repository.PlantRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PlantServiceTest {
    @Mock
    private PlantRepository plantRepository;

    @InjectMocks
    private PlantService plantService;

    private Plant plant1;
    private Plant plant2;
    private Plant plant3;
    private List<Plant> list;

    @BeforeEach
    void plantList(){
        plant1 = new Plant(1L, "Monstera", LocalDate.of(2026, 7, 22));
        plant2 = new Plant(2L, "Spider", LocalDate.of(2026, 7, 20));
        plant3 = new Plant(3L, "Umbrella", LocalDate.of(2026, 7, 12));
        list = new ArrayList<>();
        list.add(plant1);
        list.add(plant2);
        list.add(plant3);
    }

    @Test
    void getAllPlants_returnsPlants() {
        when(plantRepository.findAll()).thenReturn(list);
        List<Plant> expectedList = plantService.getAllPlants();

        assertThat(expectedList).isEqualTo(list);
        verify(plantRepository).findAll();
    }

    @Test
    void removePlant_deletesPlant(){
        plantService.removePlant(1L);

        verify(plantRepository).deleteById(1L);
    }
}
