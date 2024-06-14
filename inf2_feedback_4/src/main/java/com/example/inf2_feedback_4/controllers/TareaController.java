package com.example.inf2_feedback_4.controllers;


import com.example.inf2_feedback_4.models.Tarea;
import com.example.inf2_feedback_4.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TareaController {
    @Autowired
    private TareaService tareaService;

    /*INSERCIÓN DE TAREAS*/
    @GetMapping({"/", "/home"})
    public String index() {
        return "cargarTarea";
    }
    /*CREAR TAREAS*/
    @PostMapping("formularioTarea")
    public String createTarea(@RequestParam("titulo") String titulo,
                             @RequestParam("descripcion") String descripcion,
                             @RequestParam("completada") String completada,
                             Model model) {
        Tarea tarea = new Tarea();
        tarea.setTitulo(titulo);
        tarea.setDescripcion(descripcion);
        tarea.setCompletada(completada);
        tareaService.createTarea(tarea);
        System.out.println("Tarea añadida correctamente: "+ tarea);
        return "cargarTarea";
    }

    /*LISTAR TAREAS*/
    @GetMapping({"/vertarea", "/formularioTarea"})
    public String verTareas(Model model) {
        List<Tarea> tareas = tareaService.getAllTarea();
        model.addAttribute("tareas", tareas);
        return "listarTareas";
    }
}
