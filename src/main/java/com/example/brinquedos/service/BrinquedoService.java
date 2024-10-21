package com.example.brinquedos.service;

import com.example.brinquedos.entity.Brinquedo;
import com.example.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<Brinquedo> listarTodos() {
        return brinquedoRepository.findAll();
    }

    public Brinquedo salvar(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public Brinquedo buscarPorId(Long id) {
        return brinquedoRepository.findById(id).orElse(null);
    }
}
