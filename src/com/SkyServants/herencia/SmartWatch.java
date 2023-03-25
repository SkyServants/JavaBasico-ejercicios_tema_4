package com.SkyServants.herencia;

import com.SkyServants.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    //parametros

     public String colorCorreas;
     public String genero;

    //Constructor
    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, double dimensionPantalla,
                      double precio, boolean disponibilidad, String colorCorreas, String genero) {

        super(marca, modelo, color, dimensionPantalla, precio, disponibilidad);

        this.colorCorreas = colorCorreas;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                "colorCorreas='" + colorCorreas + '\'' +
                ", genero='" + genero + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", dimensionPantalla=" + dimensionPantalla +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad;
    }
}
