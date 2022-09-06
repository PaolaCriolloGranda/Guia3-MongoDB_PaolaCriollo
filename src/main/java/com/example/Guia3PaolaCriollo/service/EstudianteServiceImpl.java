package com.example.Guia3PaolaCriollo.service;

import com.example.Guia3PaolaCriollo.model.Estudiante;
import com.example.Guia3PaolaCriollo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante, Long> implements EstudianteService{
    @Autowired
    EstudianteRepository estudianterep;
    @Override
    public Estudiante findById(Long aLong) {
        return null;
    }

    @Override
    public CrudRepository<Estudiante, Long> getDao() {
        return estudianterep;
    }
}
