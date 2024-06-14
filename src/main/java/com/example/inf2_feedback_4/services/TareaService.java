package com.example.inf2_feedback_4.services;


import com.example.inf2_feedback_4.models.Tarea;

import java.util.List;

public interface TareaService {
    Tarea createTarea(Tarea tarea);
    List<Tarea> getAllTarea();
    Tarea getTareaById(Long id);
    Tarea updateTarea(Tarea tarea);
    void deleteTarea(Long id);
}
