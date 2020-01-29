package sistematransporte;

import java.util.ArrayList;

public class Terrestre extends UTransporte implements AccionT{
    private int NumRuedas;


    public enum Traccion{
        CUATROXDOS, DOSXDOS, DOSXCUATRO;
    }
    Enum tra;
    public Terrestre(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca,int NumRuedas, Traccion tr) {
        super(placa, NumPasajero, Cilindro, ValorUnidad,  Tseguro, tipo, marca);
        this.NumRuedas = NumRuedas;
        this.tra=tr.DOSXDOS;
    }

    public int getNumRuedas() {
        return NumRuedas;
    }

    public Enum getTra() {
        return tra;
    }

    public void setNumRuedas(int NumRuedas) {
        this.NumRuedas = NumRuedas;
    }
    
    @Override
    public void Rodar() {
        System.out.println("ESTOY RODANDO");
    }
    public String toString(){
      
        String s="";
            s+="PLACA: "+super.getPlaca()+"NUMERO PASAJEROS: "+super.getNumPasajero()+" CILINDRAJE: "+super.getCilindro()+
                    " VALOR UNIDAD: "+super.getValorUnidad()+" TIPO SEGURO: "+super.getTseguro()+" TIPO DE MOTOR: "+super.getTipo()+
                    " MARCA: "+super.getMarca()+" Numero de ruedas: "+getNumRuedas()+
                    " Traccion: "+getTra();
        
        return s;
    }
    
     
                
    
}
