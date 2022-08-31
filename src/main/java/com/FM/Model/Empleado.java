
package com.FM.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

enum Rol_Enum { ADMINISTRADOR,OPERATIVO
}

@AllArgsConstructor
@Getter
@Setter

public class Empleado {

    private String nombreEmpleado, correo;
    private Empresa empresa;
    private Rol_Enum rol;

}
