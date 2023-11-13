package com.corenetwork.modelo;

public class SeguroCoche {
    private Italler taller;  //Acoplamiento
    private  String aseguradora;
    public String reparar(Coche c){
        return taller.reparar(c);
    }

    @Override
    public String toString() {
        return "SeguroCoche{" +
                "taller=" + taller +
                ", aseguradora='" + aseguradora + '\'' +
                '}';
    }

    public SeguroCoche() {
    }

    public SeguroCoche(Italler taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public Italler getTaller() {
        return taller;
    }

    public void setTaller(Italler taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
