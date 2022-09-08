package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empleado;

import java.util.List;

public interface IEmpleadoService {

    Empleado create( Empleado empleado) throws Exception;
    Empleado update( Empleado empleado) throws Exception;
    List<Empleado> readAll() throws Exception;
    Empleado
    readById( Long id) throws Exception;
    Empleado deleted(Long id) throws Exception;







}

