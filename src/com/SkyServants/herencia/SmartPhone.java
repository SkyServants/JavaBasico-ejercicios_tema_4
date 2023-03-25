package com.SkyServants.herencia;

import com.SkyServants.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    //parametros
    public int pixelCam;
    public int numCam;
    public String carcasa;

    //Constructor
    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, double dimensionPantalla, double precio,
                      boolean disponibilidad, int pixelCam, int numCam, String carcasa) {

        super(marca, modelo, color, dimensionPantalla, precio, disponibilidad);

        this.pixelCam = pixelCam;
        this.numCam = numCam;
        this.carcasa = carcasa;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pixelCam=" + pixelCam +
                ", numCam=" + numCam +
                ", carcasa='" + carcasa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", dimensionPantalla=" + dimensionPantalla +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}

