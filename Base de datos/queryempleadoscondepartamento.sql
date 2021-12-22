
SELECT num_emp,nombre,departamento FROM empleados_bd.empleado
inner JOIN empleados_bd.dept
ON empleados_bd.dept.num_depto = empleados_bd.empleado.num_depto;


