package com.example.Structure.service;

import com.example.Structure.entity.dto.request.TurboRequest;
import com.example.Structure.entity.dto.response.TurboResponse;

import java.util.List;

public interface TurboService {
        List<TurboResponse> getAllCars();
        TurboResponse getCarById(Long id);
        void addCar(TurboRequest turboRequest);
        void updateCar(Long id, TurboRequest turboRequest);

        void updateCarYear(Long id, Integer year);
        void deleteCar(Long id);

    }

