package com.FM.Model;

public class Main {
    public static void main(String[] args) {
        Empresa mcdonald = new Empresa("McDonald's", "Cll33-#43-e", "3233232", "313331");
        System.out.println(mcdonald.getNombre());
        mcdonald.setNombre("McDonal's S.A");
        System.out.println(mcdonald.getNombre());

        Empleado ramon_Perez = new Empleado("Ramon Perez", " rperez@gmail.com", mcdonald, Rol_Enum.OPERATIVO);
        System.out.println(ramon_Perez.getNombreEmpleado());
        ramon_Perez.setNombreEmpleado("Ramon Peralta Martinez");
        System.out.println(ramon_Perez.getNombreEmpleado());

        MovimientoDeDinero mov = new MovimientoDeDinero(150000.45,"tornillos",ramon_Perez);
        System.out.println(mov.getConceptoMovimientoDinero());
        mov.setConceptoMovimientoDinero("varilla");
        System.out.println(mov.getConceptoMovimientoDinero());
    }
}
