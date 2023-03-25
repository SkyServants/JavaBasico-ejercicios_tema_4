package com.SkyServants.clases;

import com.SkyServants.herencia.SmartPhone;
import com.SkyServants.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        //Objeto numero 1
        //instancia del objeto

        SmartPhone motorolaG5 = new SmartPhone("Motorola","G5","Negro",5.2,525000.99,true,50,3,"verde");

        System.out.println("DISPOSITIVO INTELIGENTE NUMERO 1");
        System.out.println("Marca" + " " + motorolaG5.marca);
        System.out.println("Modelo" + " " + motorolaG5.modelo);
        System.out.println("Color" + " " + motorolaG5.color);
        System.out.println("Dimension de pantalla" + " " + motorolaG5.dimensionPantalla);
        System.out.println("Precio" + " " + motorolaG5.precio);
        System.out.println("Dispobile" + " " + motorolaG5.disponibilidad);

        System.out.println("Megapixeles" + " " + motorolaG5.pixelCam);
        System.out.println("Numero de camaras" + " " + motorolaG5.numCam);
        System.out.println("Color carcasa" + " " + motorolaG5.carcasa);


        //Objeto numero 2

        SmartWatch reloj1 = new SmartWatch("Xiaomi","V15","rosado",1.2,1000000,true,"turquesa","Mujer");


        System.out.println("DISPOSITIVO INTELIGENTE NUMERO 2");
        System.out.println("Marca" + " " + reloj1.marca);
        System.out.println("Modelo" + " " + reloj1.modelo);
        System.out.println("Color" + " " + reloj1.color);
        System.out.println("Dimension de pantalla" + " " + reloj1.dimensionPantalla);
        System.out.println("Precio" + " " + reloj1.precio);
        System.out.println("Dispobile" + " " + reloj1.disponibilidad);



        System.out.println("color corread de reloj" + " " + reloj1.colorCorreas);
        System.out.println("Disponible para" + " " + reloj1.genero);

        System.out.println(reloj1.garantiaDevice(2,"años"));

        //objeto 3 polimorfismo
        System.out.println("POLIMORFISMO");

        SmartDevice dispositivoNuevo;

        dispositivoNuevo = new SmartPhone();
        String dispositivo= dispositivoNuevo.garantiaDevice(5,"meses");

        System.out.println("Dispositivo uno "+ dispositivo);

       dispositivoNuevo = new SmartWatch();
       String dispositivo2 = dispositivoNuevo.garantiaDevice(1,"año");

       System.out.println("Dispositivo dos " + dispositivo2);





    }
}
