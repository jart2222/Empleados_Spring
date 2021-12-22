package com.empleados.demo;

import com.empleados.demo.model.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadosService {
    private final EmpleadosRepository empleadosRepository;

    @Autowired

    public EmpleadosService(EmpleadosRepository empleadosRepository) {
        this.empleadosRepository = empleadosRepository;
    }

    public List<Empleados>getAllEmpleados(){
        return empleadosRepository.findAll();
    }


}
