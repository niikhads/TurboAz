package com.example.Structure.entity.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TurboResponse {
    private Long id;
    private String marka;
    private String model;
    private Integer year;
    private String engine;
    private String  ban;
    private String carinfo;
}
