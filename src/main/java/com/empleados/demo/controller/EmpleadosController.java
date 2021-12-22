package com.empleados.demo.controller;

import com.empleados.demo.EmpleadosService;
import com.empleados.demo.model.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin("*")
public class EmpleadosController {
    private final EmpleadosService empleadosService;

    @Autowired
    public EmpleadosController(EmpleadosService empleadosService) {
        this.empleadosService = empleadosService;
    }
    @GetMapping
    public List<Empleados>getAllEmpleados(){
        return empleadosService.getAllEmpleados();
    }

}
