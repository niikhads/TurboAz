package com.example.Structure.entity.model;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@RequiredArgsConstructor

public class Turbo {
    private Long id;
    private String marka;
    private String model;
    private Integer year;
    private String engine;
    private String  ban;
    private String carinfo;
}
