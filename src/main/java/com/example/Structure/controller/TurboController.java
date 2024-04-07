package com.example.Structure.controller;

import com.example.Structure.entity.dto.request.TurboRequest;
import com.example.Structure.entity.dto.response.TurboResponse;
import com.example.Structure.service.TurboService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class TurboController {


        private final TurboService turboService;

        @GetMapping
        public ResponseEntity<List<TurboResponse>> getAllCars() {
            List<TurboResponse> turbos = turboService.getAllCars();
            return ResponseEntity.ok(turbos);
        }

        @GetMapping("id/{id}")
        public ResponseEntity<TurboResponse> getCarById(@PathVariable("id") Long id) {
            TurboResponse turbo = turboService.getCarById(id);
            return ResponseEntity.ok(turbo);
        }

        @PostMapping
        public ResponseEntity<Void> addCar(@RequestBody TurboRequest turboRequest) {
            turboService.addCar(turboRequest);
            return ResponseEntity.ok().build();
        }

        @PutMapping("/id/{id}")
        public ResponseEntity<Void> updateCar(@PathVariable Long id,
                                               @RequestBody TurboRequest turboRequest) {
            turboService.updateCar(id, turboRequest);
            return ResponseEntity.ok().build();
        }

        @PatchMapping("/id/{id}")
        public ResponseEntity<Void> updateCarYear(@PathVariable Long id,
                                                    @RequestParam Integer year) {
            turboService.updateCarYear(id, year);
            return ResponseEntity.ok().build();
        }

        @DeleteMapping("/id/{id}")
        public ResponseEntity<Void> deleteCarById(@PathVariable Long id){
            turboService.deleteCar(id);
            return ResponseEntity.ok().build();
        }

    }
