package com.corenetwork.presentacion;

import com.corenetwork.modelo.Coche1;
import com.corenetwork.modelo.Conductor;

import java.util.concurrent.Callable;

public class ProbarConductor {
    public static void main(String[] args) {
       Coche1 c1=new Coche1(20);
        Conductor c2=new Conductor(c1);
        System.out.println(c2.conducir());
    }
}
