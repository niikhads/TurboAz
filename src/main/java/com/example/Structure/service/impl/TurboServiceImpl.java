package com.example.Structure.service.impl;

import com.example.Structure.entity.dto.request.TurboRequest;
import com.example.Structure.entity.dto.response.TurboResponse;
import com.example.Structure.entity.model.Turbo;
import com.example.Structure.mapper.TurboMapper;
import com.example.Structure.repository.TurboMyBatisRepository;
import com.example.Structure.service.TurboService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TurboServiceImpl implements TurboService {


    private final TurboMapper turboMapper;
    private final TurboMyBatisRepository turboMyBatisRepository;

    @Override
    public List<TurboResponse> getAllCars() {
        List<Turbo> turbos = turboMyBatisRepository.findAll();

        List<TurboResponse> carResponseList = turboMapper.toCarResponseList(turbos);

        return carResponseList;
    }

    @Override
    public TurboResponse getCarById(Long id) {
        Optional<Turbo> carOptional = turboMyBatisRepository.findById(id);
        return carOptional.map(turboMapper::toCarResponse).orElse(null);
    }
    @Override
    public void addCar(TurboRequest turboRequest) {
        Turbo turbo = turboMapper.toCar(turboRequest);
        turboMyBatisRepository.insert(turbo);

    }

    @Override
    public void updateCar(Long id, TurboRequest turboRequest) {
        Turbo turbo = turboMapper.toCar(id, turboRequest);
        turboMyBatisRepository.update(turbo);
    }

    @Override
    public void updateCarYear(Long id, Integer year) {
        turboMyBatisRepository.updateCarYear(id, year);
    }

    @Override
    public void deleteCar(Long id) {
        turboMyBatisRepository.delete(id);
    }

}

