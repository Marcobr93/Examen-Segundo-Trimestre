package org.company;

/**
 * Created by marco on 30/3/17.
 */
public class Electrodomestico {
    /**
     * Marca del electrodoméstico
     */
    protected String marca;
    /**
     * Modelo del electrodoméstico
     */
    protected String modelo;
    /**
     * Precio base del electrodoméstico
     */
    protected double precioBase;
    /**
     * Consumo energético del electrodoméstico
     */
    protected char consumoEnergetico;
    /**
     * Altura del electrodoméstico
     */
    protected double altura;
    /**
     * Anchura del electrodoméstico
     */
    protected double anchura;
    /**
     * Peso del electrodoméstico
     */
    protected double peso;

    // Constructores

    /**
     * Constructor sin parámetros
     */
    public Electrodomestico() {
    }

    /**
     * Constructor con todos los parámetros
     * @param marca
     * @param modelo
     * @param precioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     */
    public Electrodomestico(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }

    // Accesores

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() != 0){
            this.marca = marca;
        }else {
            System.out.println("Introduzca una marca");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() != 0){
            this.modelo = modelo;
        }else {
            System.out.println("Introduzca un modelo");
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0){
            System.out.println("Introduzca un precio base correcto");
        }else {
            this.precioBase = precioBase;
        }
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        if(consumoEnergetico == 'A'){
            this.consumoEnergetico = consumoEnergetico;
        }else if(consumoEnergetico == 'B'){
            this.consumoEnergetico = consumoEnergetico;
        }else if(consumoEnergetico == 'C') {
            this.consumoEnergetico = consumoEnergetico;
        }else if(consumoEnergetico == 'D'){
            this.consumoEnergetico = consumoEnergetico;
        }else if(consumoEnergetico == 'E'){
            this.consumoEnergetico = consumoEnergetico;
        }else if(consumoEnergetico == 'F'){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            System.out.println("Introduzca una letra entre la A y la F.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            System.out.println("Introduzca una altura correcta");
        }else {
            this.altura = precioBase;
        }
    }


    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura < 0){
            System.out.println("Introduzca una anchura correcta");
        }else {
            this.anchura = anchura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0){
            System.out.println("Introduzca un peso correcta");
        }else {
            this.peso = peso;
        }
    }


    // Métodos

    /**
     * Método que calcula el precio bruto del electrodoméstico sumándole un plus en base a la letra
     * @return devuelve el resultado, que es la suma del precio bruto más el plus
     */
    public double precioBruto() {
        double resultado = this.getPrecioBase();

        switch (getConsumoEnergetico()){
            case 'A':
                resultado += 100;
                break;
            case 'B':
                resultado += 80;
                break;
            case 'C':
                resultado += 60;
                break;
            case 'D':
                resultado += 50;
                break;
            case 'E':
                resultado += 30;
                break;
            case 'F':
                resultado += 10;
                break;
            default:
        }
        return resultado;
    }

    /**
     * Método que calcula el precio del transporte del electrodoméstico en función del peso de este.
     * @return devuelve el precio, que es el plus que pagamos según el peso del electrodoméstico
     */
    public double precioTransporte() {
        double precio = 0.0;

        if (peso < 20){
            precio += 10;
        }else if (peso >= 20 && peso < 50){
            precio += 50;
        }else if (peso >= 50 && peso < 80){
            precio += 80;
        }else if (peso >= 80 ){
            precio += 100;
        }

        return precio;
    }

    /**
     * Método que calcula la suma del precio bruto y del transporte del electrodoméstico
     * @return devuelve el precio total
     */
    public double pvp() {
        double precioTotal;

        precioTotal = this.precioBruto() + this.precioTransporte();

        return precioTotal;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase + " euros" +
                ", consumoEnergetico=" + consumoEnergetico +
                ", altura=" + altura + " metros" +
                ", anchura=" + anchura + " metros" +
                ", peso=" + peso + " Kg" +
                '}';
    }
}
