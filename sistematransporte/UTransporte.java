package sistematransporte;

import java.util.ArrayList;

public abstract class UTransporte {
    private String placa;
    private int NumPasajero;
    private double Cilindro;
    private double ValorUnidad;
    private Seguro Tseguro;
    private TipoMotor tipo;
    private Marca marca;

    public UTransporte(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca) {
       this.placa=placa;
        this.NumPasajero = NumPasajero;
        this.Cilindro = Cilindro;
        this.ValorUnidad = ValorUnidad;
        this.Tseguro = Tseguro;
        this.tipo=tipo;
        this.marca=marca;
        
    }

    public int getNumPasajero() {
        return NumPasajero;
    }

    public void setNumPasajero(int NumPasajero) {
        this.NumPasajero = NumPasajero;
    }

    public double getCilindro() {
        return Cilindro;
    }

    public void setCilindro(double Cilindro) {
        this.Cilindro = Cilindro;
    }

    public double getValorUnidad() {
        return ValorUnidad;
    }

    public void setValorUnidad(double ValorUnidad) {
        this.ValorUnidad = ValorUnidad;
    }

    public Seguro getTseguro() {
        return Tseguro;
    }

    public void setTseguro(Seguro Tseguro) {
        this.Tseguro = Tseguro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public static void CantidadPasajeros(ArrayList<UTransporte> pasajeros){
        int cp=0;
        for (UTransporte e : pasajeros){
            cp+=e.getNumPasajero();
        }
        System.out.println("Los pasajeros Totales son: "+cp);
    }
    
}
