/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia_vehiculos;

/**
 *
 * @author user
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motocicletas moto = new Motocicletas("125", "Manual", "Deportiva");
        moto.imprimirDatos();
    }
    
}

class Camiones extends Vehiculos{
    private String capacidadCarga;
    private String numeroEjes;
    private String tamañoCamion;
    
    public Camiones(){
        super();
        this.capacidadCarga = "";
        this.numeroEjes = "";
        this.tamañoCamion = "";
        System.out.println("CLASE CAMIONES");
    }

    public Camiones(String capacidadCarga, String numeroEjes, String tamañoCamion) {
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tamañoCamion = tamañoCamion;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTamañoCamion() {
        return tamañoCamion;
    }

    public void setTamañoCamion(String tamañoCamion) {
        this.tamañoCamion = tamañoCamion;
    }
    
    
    
}

class Camionetas extends Vehiculos{
    private String capacidadCarga;
    private String tipoCabina;
    private String tamañoCamioneta;
    
    public Camionetas(){
        super();
        this.capacidadCarga = "";
        this.tipoCabina = "";
        this.tamañoCamioneta = "";
        System.out.println("CLASE CAMIONETAS");
    }

    public Camionetas(String capacidadCarga, String tipoCabina, String tamañoCamioneta) {
        this.capacidadCarga = capacidadCarga;
        this.tipoCabina = tipoCabina;
        this.tamañoCamioneta = tamañoCamioneta;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public String getTamañoCamioneta() {
        return tamañoCamioneta;
    }

    public void setTamañoCamioneta(String tamañoCamioneta) {
        this.tamañoCamioneta = tamañoCamioneta;
    }
    
    
    
}

class Automoviles extends Vehiculos{
    private String tipoVehiculo;
    private String equipamiento;
    private String tipoTransmision;
    
    public Automoviles(){
        super();
        this.tipoVehiculo = "";
        this.equipamiento = "";
        this.tipoTransmision = "";
        System.out.println("CLASE AUTOMOVILES");
    }

    public Automoviles(String tipoVehiculo, String equipamiento, String tipoTransmision) {
        this.tipoVehiculo = tipoVehiculo;
        this.equipamiento = equipamiento;
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    
    
    
}

class Motocicletas extends Vehiculos{
    private String cilndrada;
    private String tipoTransmision;
    private String posicionConduccion;
    
    public Motocicletas(){
        super();
        this.cilndrada = "";
        this.tipoTransmision = "";
        this.posicionConduccion = "";
        System.out.println("CLASE MOTOCICLETAS");
    }

    public Motocicletas(String cilndrada, String tipoTransmision, String posicionConduccion) {
        System.out.println("CLASE MOTOCICLETAS");
        this.cilndrada = cilndrada;
        this.tipoTransmision = tipoTransmision;
        this.posicionConduccion = posicionConduccion;
        System.out.println("CLASE MOTOCICLETAS");
    }

    public String getCilndrada() {
        return cilndrada;
    }

    public void setCilndrada(String cilndrada) {
        this.cilndrada = cilndrada;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getPosicionConduccion() {
        return posicionConduccion;
    }

    public void setPosicionConduccion(String posicionConduccion) {
        this.posicionConduccion = posicionConduccion;
    }
    
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("\n Cilindrada: " + cilndrada + "\n Tipo de tranmsision: " + tipoTransmision + "\n Posicion del conductor: " + posicionConduccion);
    }
}

class Vehiculos{
    private String tipoCombustible;
    private String numeroLlantas;
    private String capacidadMotor;
    private String cilindrosMotor;
    private String capacidadPasajeros;
    private String marca;
    private String modelo;
    private int año;
    
    public Vehiculos(){
        this.tipoCombustible = "";
        this.numeroLlantas = "";
        this.capacidadMotor = "";
        this.cilindrosMotor = "";
        this.capacidadPasajeros = "";
        this.marca = "";
        this.modelo = "";
        this.año = 0;
        System.out.println("CLASE VEHICULOS");
    }

    public Vehiculos(String tipoCombustible, String numeroLlantas, String capacidadMotor, String cilindrosMotor, String capacidadPasajeros, String marca, String modelo, int año) {
        this.tipoCombustible = tipoCombustible;
        this.numeroLlantas = numeroLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(String numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public String getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(String capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public String getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(String cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public String getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(String capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void imprimirDatos(){
        System.out.println("\n Tipo de combustible: " + tipoCombustible + "\n Numero de llantas: " + numeroLlantas + "\n Capacidad del motor: " + capacidadMotor + 
                "\n Numero de cilindros del motor: " + cilindrosMotor + "\n Capacidad de pasajeros: " + capacidadPasajeros + "\n Marca del vehiculo: " + marca + 
                "\n Modelo del vehiculo: " + modelo + "\n Año del vehiculo: " + año);
    }
}