package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.dominio.model.Barbeiro;
import me.dio.dominio.repository.BarbeiroRepository;
import me.dio.service.BarbeiroService;

@Service
public class BarbeiroServiceImpl implements BarbeiroService {

    private final BarbeiroRepository barbeiroRepository;

    public BarbeiroServiceImpl(BarbeiroRepository barbeiroRepository) {
        this.barbeiroRepository = barbeiroRepository;
    }
    
    @Override
    public Barbeiro findById(Long id) {
        return barbeiroRepository.findById(id).orElseThrow(() -> new NoSuchElementException("=============Nenhum barbeiro não encontrado com o id: " + id));
    }

    @Override
    public Barbeiro create(Barbeiro barbeiroToCreate) {
        if (barbeiroToCreate.getId() != 0 && barbeiroRepository.existsById(barbeiroToCreate.getId())){
            throw new IllegalArgumentException("============This User ID already exists==============.");
        }
        return barbeiroRepository.save(barbeiroToCreate);
    }


}