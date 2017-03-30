package org.company;

/**
 * Created by marco on 30/3/17.
 */
public class Frigorifico extends Electrodomestico {
    /**
     * Capacidad total del frigorífico
     */
    private double capacidadTotal;
    /**
     * Capacidad del congelador del frigorífico
     */
    private double capacidadCongelador;
    /**
     *  Características del frigorífico
     */
    private String caracteristicas[] = new String[4];

    // Constructores

    /**
     * Constructor sin parámetros
     */
    public Frigorifico() {
    }

    /**
     * Constructor con todos los parámetros de frigorífico y de electrodoméstico
     * @param marca
     * @param modelo
     * @param precioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     * @param capacidadTotal
     * @param capacidadCongelador
     * @param caracteristicas
     */
    public Frigorifico(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso, double capacidadTotal, double capacidadCongelador, String[] caracteristicas) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.capacidadTotal = capacidadTotal;
        this.capacidadCongelador = capacidadCongelador;
        this.caracteristicas = caracteristicas;
    }

    // Accesores


    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(double capacidadTotal) {
        if (capacidadTotal < 0){
            System.out.println("Introduzca una capacidad total correcta");
        }else {
            this.capacidadTotal = capacidadTotal;
        }
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(double capacidadCongelador) {
        if (capacidadCongelador < 0){
            System.out.println("Introduzca una capacidad total correcta");
        }else {
            this.capacidadCongelador = capacidadCongelador;
        }
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String[] caracteristicas) {
        if (caracteristicas.length < 1){
            System.out.println("Especifique características para su frigorífico.");
        }else {
            this.caracteristicas = caracteristicas;
        }
    }


    // Métodos

    /**
     * Método varargs para calcular el ingreso total de frigoríficos.
     * @param frigorificos
     * @return
     */
    public double ingresoTotalFrigorificos(Frigorifico...frigorificos){
        double ingresoTotal = 0.0;

        if (frigorificos.length == 0){
            return 0;

        }for (Frigorifico ingreso: frigorificos){
            ingresoTotal += pvp();
        }
        return ingresoTotal;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "capacidadTotal=" + capacidadTotal + " litros" +
                ", capacidadCongelador=" + capacidadCongelador + " litros" +
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}
