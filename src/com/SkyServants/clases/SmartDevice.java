package com.SkyServants.clases;

public class SmartDevice {

    //parametros
    protected String marca;
    protected String modelo;
    protected String color;
    protected double dimensionPantalla;
    protected double precio;

    protected boolean disponibilidad;


    //Constructor
    public SmartDevice() {
    }

    public  SmartDevice(String marca, String modelo,String color, double dimensionPantalla, double precio, boolean disponibilidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.dimensionPantalla = dimensionPantalla;
        this. precio = precio;
        this.disponibilidad = disponibilidad;

    }


    //Metodos
    public String garantiaDevice( int tiempo, String garantia){

       String  numTiempo = String.valueOf(tiempo);
        return "Se aplica garantia extendida por:" + " " + numTiempo + " " + garantia ;
    }


    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", dimensionPantalla=" + dimensionPantalla +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
