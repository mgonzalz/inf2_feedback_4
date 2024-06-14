package com.example.inf2_feedback_4.services;


import com.example.inf2_feedback_4.models.Tarea;
import com.example.inf2_feedback_4.models.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TareaServiceImpl implements TareaService{
    @Autowired
    private final TareaRepository tareaRepository;

    public TareaServiceImpl(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @Override
    public Tarea createTarea(Tarea tarea) {
        tarea.setFechaCreacion(LocalDateTime.now());
        return tareaRepository.save(tarea);
    }

    @Override
    public List<Tarea> getAllTarea() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea getTareaById(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    @Override
    public Tarea updateTarea(Tarea tarea) {
        Optional<Tarea> tareaOptional = this.tareaRepository.findById(tarea.getId());
        if (tareaOptional.isPresent()) {
            Tarea tareaUpdate = tareaOptional.get();
            tareaUpdate.setTitulo(tarea.getTitulo());
            tareaUpdate.setDescripcion(tarea.getDescripcion());
            tareaUpdate.setCompletada(tarea.getCompletada());
            return tareaRepository.save(tareaUpdate);
        }
        return null;
    }

    @Override
    public void deleteTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
