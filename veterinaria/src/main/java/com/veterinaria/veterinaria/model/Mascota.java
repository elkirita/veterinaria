package com.veterinaria.veterinaria.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {

    private Long id;
    private String nombre;
    private String especie;
    private int edad;
    private String duenio;
}
