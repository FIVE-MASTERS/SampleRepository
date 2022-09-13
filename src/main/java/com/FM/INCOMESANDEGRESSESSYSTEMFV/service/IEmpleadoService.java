package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import java.util.List;

public interface IEmpleadoService {

   Empleado create( Empleado empleado) throws Exception;
   Empleado update( Empleado empleado) throws Exception;
   List<Empleado> readAll() throws Exception;
   Empleado readById( Long id) throws Exception;
   void  delete(Long id) throws Exception;

}

