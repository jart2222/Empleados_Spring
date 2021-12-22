package com.empleados.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_emp",unique = true,nullable = false)
    private Long num_emp;
    private String nombre;
    private Long num_depto;

    public Empleados(Long num_emp, String nombre, Long num_depto) {
        this.num_emp = num_emp;
        this.nombre = nombre;
        this.num_depto = num_depto;
    }

    public Empleados() {
    }

    public Long getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(Long num_emp) {
        this.num_emp = num_emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNum_depto() {
        return num_depto;
    }

    public void setNum_depto(Long num_depto) {
        this.num_depto = num_depto;
    }
}
