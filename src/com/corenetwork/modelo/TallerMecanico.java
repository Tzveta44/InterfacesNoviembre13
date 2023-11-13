package com.corenetwork.modelo;

public class TallerMecanico implements Italler{

    @Override
    public String reparar(Coche c) {
        return "El coche esta en el taller Mecánico:  "+ c.getMatricula()+", Modelo: " + c.getModelo()+"\nEl coche ha sido reparado.";

    }
}
