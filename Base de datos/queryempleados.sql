CREATE DATABASE empleados_bd;
USE empleados_bd;
CREATE TABLE dept (
    num_depto int AUTO_INCREMENT UNIQUE NOT NULL,
    departamento VARCHAR(100) NOT NULL,
    PRIMARY KEY (num_depto)
);
-- datos de la tabla dept


INSERT INTO `empleados_bd`.`dept` (`departamento`) VALUES ('Contabilidad ');
INSERT INTO `empleados_bd`.`dept` (`departamento`) VALUES ('Recursos Humanos');
INSERT INTO `empleados_bd`.`dept` (`departamento`) VALUES ('Programacion');

CREATE TABLE  empleado (
    num_emp int NOT NULL AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    num_depto int NOT NULL,
    PRIMARY KEY (num_emp),
    FOREIGN KEY (num_depto) REFERENCES dept(num_depto)
    
);
-- datos de la tabla empleados 

INSERT INTO `empleados_bd`.`empleado` (`nombre`, `num_depto`) VALUES ('Jose Armando ', '2');
INSERT INTO `empleados_bd`.`empleado` (`nombre`, `num_depto`) VALUES ('Sergio Borjon', '1');
INSERT INTO `empleados_bd`.`empleado` (`nombre`, `num_depto`) VALUES ('Mariana Garmendia ', '2');


