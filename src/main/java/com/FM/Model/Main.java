package com.FM.Model;

public class Main {
    public static void main(String[] args) {
        Empresa mcdonald = new Empresa("McDonald's","Cll33-#43-e","3233232","313331");
        System.out.println(mcdonald.getNombre());
        mcdonald.setNombre("McDonal's S.A");
        System.out.println(mcdonald.getNombre());
    }
}
