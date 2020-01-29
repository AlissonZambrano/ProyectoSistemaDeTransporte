package sistematransporte;

import java.util.ArrayList;
import sistematransporte.Acuatico.TipoAgua;
import sistematransporte.Terrestre.Traccion;

public class SistemaTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, ArrayList ListaPasajer,int NumRuedas, Enum tra)
       Seguro terrestre= new Seguro("HISPANO LATINA", 0.12);
       Seguro aereo= new Seguro("SOAT", 0.15);
       Seguro acuatico= new Seguro("LATINA", 0.30);
       
       Terrestre carro= new Terrestre("GSM-383", 60, 3.2, 50000.45, terrestre, TipoMotor.DIESEL, Marca.MAZDA, 4, Traccion.DOSXCUATRO);
//    public Acuatico(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca, TipoAgua ti){

       Acuatico barco = new Acuatico("GSM-987", 5, 4.3, 12345.432, acuatico, TipoMotor.GASOLINA, Marca.PEUGEOT,TipoAgua.DULCE);
       // public Aereo(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca, int motores, String vuelo){
   
       Aereo avion = new Aereo("SDF-123",32, 4.3, 2323453.32, aereo, TipoMotor.ECOLOGICO, Marca.CHEVROLET,4, "345678mshd6788");
       
       ArrayList<UTransporte> Terrestre= new ArrayList();
       ArrayList<UTransporte> Aereo= new ArrayList();
       ArrayList<UTransporte> Acuatico= new ArrayList();
       Terrestre.add(carro);
       Aereo.add(avion);
       Acuatico.add(barco);
       
       UTransporte.CantidadPasajeros(Aereo);
       UTransporte.CantidadPasajeros(Terrestre);
       UTransporte.CantidadPasajeros(Acuatico);
       
       terrestre.CobrarSeguros(carro);
       aereo.CobrarSeguros(avion);
       acuatico.CobrarSeguros(barco);
    }
    
}
