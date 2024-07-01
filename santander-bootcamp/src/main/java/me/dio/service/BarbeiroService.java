package me.dio.service;

import me.dio.dominio.model.Barbeiro;

public interface BarbeiroService {
    Barbeiro findById(Long id);

    Barbeiro create(Barbeiro barbeiroToCreate);

    
}