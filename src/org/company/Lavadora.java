package org.company;

/**
 * Created by marco on 30/3/17.
 */
public class Lavadora extends Electrodomestico {
    /**
     * Tipo de carga de la lavadora
     */
    private String tipoCarga;
    /**
     * Velocidad de centrifugado de la lavadora
     */
    private double velocidadCentrifugado;
    /**
     * Booleano apra saber si es o no una secadora
     */
    private boolean secadora;

    // Constructores

    /**
     * Constructor sin parámetros
     */
    public Lavadora() {
    }

    /**
     * Constructor con todos los parámetros tanto de lavadora como de electrodoméstico.
     * @param marca
     * @param modelo
     * @param precioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     * @param tipoCarga
     * @param velocidadCentrifugado
     * @param secadora
     */
    public Lavadora(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso, String tipoCarga, double velocidadCentrifugado, boolean secadora) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.tipoCarga = tipoCarga;
        this.velocidadCentrifugado = velocidadCentrifugado;
        this.secadora = secadora;
    }


    // Accesores


    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        if (tipoCarga != "Frontal" || tipoCarga != "Superior"){
            System.out.println("Introduzca un tipo de carga válido.");
        }else {
            this.tipoCarga = tipoCarga;
        }
    }

    public double getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }

    public void setVelocidadCentrifugado(double velocidadCentrifugado) {
        if (velocidadCentrifugado < 0){
            System.out.println("Introduzca una velocidad de centrifugado correcta.");
        }else {
            this.velocidadCentrifugado = velocidadCentrifugado;
        }
    }

    public boolean isSecadora() {
        return secadora;
    }

    public void setSecadora(boolean secadora) {
        this.secadora = secadora;
    }


// Métodos

    /**
     * Método varargs para calcular el ingreso total de lavadoras
     * @param lavadoras
     * @return
     */
    public double ingresoTotalLavadoras(Lavadora...lavadoras){
        double ingresoTotal = 0.0;

        if (lavadoras.length == 0){
            return 0;

        }for (Lavadora ingreso: lavadoras){
            ingresoTotal += pvp();
        }
        return ingresoTotal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "tipoCarga='" + tipoCarga + '\'' +
                ", velocidadCentrifugado=" + velocidadCentrifugado + " revoluciones por minuto" +
                ", secadora=" + secadora +
                '}';
    }
}
