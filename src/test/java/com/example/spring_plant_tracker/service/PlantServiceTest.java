package com.example.spring_plant_tracker.service;

import com.example.spring_plant_tracker.model.Plant;
import com.example.spring_plant_tracker.repository.PlantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlantServiceTest {
    @Mock
    private PlantRepository plantRepository;

    @InjectMocks
    private PlantService plantService;

    @Test
    void getAllPlants_returnsPlants() {
        ArrayList<Plant> list = new ArrayList<>();
        Plant plant1 = new Plant(1L, "Monstera", LocalDate.of(2026, 7, 22));
        Plant plant2 = new Plant(2L, "Spider", LocalDate.of(2026, 7, 20));
        Plant plant3 = new Plant(3L, "Umbrella", LocalDate.of(2026, 7, 12));
        list.add(plant1);
        list.add(plant2);
        list.add(plant3);
        when(plantRepository.findAll()).thenReturn(list);

        List<Plant> expectedList = plantService.getAllPlants();

        assertThat(expectedList).isEqualTo(list);
        verify(plantRepository).findAll();
    }
}
