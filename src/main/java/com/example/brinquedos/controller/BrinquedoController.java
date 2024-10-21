package com.example.brinquedos.controller;

import com.example.brinquedos.entity.Brinquedo;
import com.example.brinquedos.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<Brinquedo> listarBrinquedos() {
        return brinquedoService.listarTodos();
    }

    @PostMapping
    public Brinquedo adicionarBrinquedo(@RequestBody Brinquedo brinquedo) {
        return brinquedoService.salvar(brinquedo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarBrinquedoPorId(@PathVariable Long id) {
        Brinquedo brinquedo = brinquedoService.buscarPorId(id);
        return brinquedo != null ? ResponseEntity.ok(brinquedo) : ResponseEntity.notFound().build();
    }
}
