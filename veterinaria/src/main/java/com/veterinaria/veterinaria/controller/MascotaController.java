package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Mascota;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private List<Mascota> lista = new ArrayList<>();
    private Long contador = 1L;

    @GetMapping
    public List<Mascota> listar(){
        return lista;
    }

    @PostMapping
    public Mascota guardar(@RequestBody Mascota mascota){
        mascota.setId(contador++);
        lista.add(mascota);
        return mascota;
    }
}
