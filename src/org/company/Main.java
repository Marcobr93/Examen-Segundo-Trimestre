package org.company;

public class Main {

    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora("asdasd","asdasd",500.25,'A', 5.05, 80.40, 90.45,"Frontal", 150.00, false);
        Lavadora lavadora2 = new Lavadora("asd","asd",400.80,'E',4.20,40.55,90.80,"Frontal",120.20, false);

        System.out.println("El sueldo bruto de la lavadora es: " + lavadora1.precioBruto() + " euros.");
        System.out.println("El precio del transporte de la lavadora ha sido: " + lavadora1.precioTransporte() + " euros.");
        System.out.println("El precio total de la lavadora1 es: " + lavadora1.pvp() + " euros.");
        System.out.println("El precio total de la lavadora2 es: " + lavadora2.pvp() + " euros.");
    }
}
