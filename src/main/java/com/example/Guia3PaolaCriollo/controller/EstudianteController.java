package com.example.Guia3PaolaCriollo.controller;

import com.example.Guia3PaolaCriollo.model.Estudiante;
import com.example.Guia3PaolaCriollo.service.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteServiceImpl estudianteImpl;


    @PostMapping("/save")
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante producto) {
        return new ResponseEntity<>(estudianteImpl.save(producto), HttpStatus.CREATED);
    }



    @GetMapping("/read")
    public ResponseEntity<List<Estudiante>> read() {
        return new ResponseEntity<>(estudianteImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        estudianteImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Estudiante> search(@PathVariable Long id) {
        return new ResponseEntity<>(estudianteImpl.findById(id), HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public Estudiante update(@PathVariable Long id, @RequestBody Estudiante p) {
        Estudiante est = estudianteImpl.FindByID(id);
        est.setNombre(p.getNombre());
        est.setCorreo_electronico(p.getCorreo_electronico());
        est.setNumero_estudiante(p.getNumero_estudiante());
        est.setCursoLista(p.getCursoLista());
        est.setGpa(p.getGpa());
        return estudianteImpl.save(est);

    }
}
