package com.example.Structure.entity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TurboRequest {
    private String marka;
    private String model;
    private Integer year;
    private String engine;
    private String  ban;
    private String carinfo;
}
