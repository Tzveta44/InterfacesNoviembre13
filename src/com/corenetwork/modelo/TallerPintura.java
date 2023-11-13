package com.corenetwork.modelo;

public class TallerPintura implements Italler{
    @Override
    public String reparar(Coche c) {
        return "El coche se esta pintando:  "+c.getMatricula()+", Modelo: "+c.getModelo()+"\nEl coche ha sido pintado.";
    }
}
