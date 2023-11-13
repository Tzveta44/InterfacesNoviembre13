package com.corenetwork.presentacion;

import com.corenetwork.modelo.*;

public class ProbarAseguradora {
    public static void main(String[] args) {
        Coche c1=new Coche("1234-MNS","Seat.");
        Italler tMecanico=new TallerMecanico();
        SeguroCoche s1 = new SeguroCoche(tMecanico,"Mapfre");
        System.out.println(s1.reparar(c1));
        Italler tPintura=new TallerPintura();
        s1.setTaller(tPintura);
        System.out.println(s1.reparar(c1));
    }
}
