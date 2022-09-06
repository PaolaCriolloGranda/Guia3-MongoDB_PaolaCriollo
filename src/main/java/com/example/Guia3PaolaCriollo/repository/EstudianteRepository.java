package com.example.Guia3PaolaCriollo.repository;

import com.example.Guia3PaolaCriollo.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudianteRepository extends MongoRepository<Estudiante, Long> {
}
