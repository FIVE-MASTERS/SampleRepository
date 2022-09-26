package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

   Boolean create( Empleado empleado) throws Exception;
   Boolean update( Empleado empleado) throws Exception;
   List<Empleado> readAll() throws Exception;
   Optional<Empleado> readById(Long id) throws Exception;
   Boolean  delete(Long id) throws Exception;
   ArrayList<Empleado> readByEmpresa(Long id) throws Exception;

}

