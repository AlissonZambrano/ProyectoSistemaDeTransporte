package sistematransporte;

public class Acuatico extends UTransporte implements AccionAc {
    public enum TipoAgua{
        DULCE, SALADA
    }
    TipoAgua agua;
    public Acuatico(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca, TipoAgua ti){
        
        super(placa, NumPasajero, Cilindro, ValorUnidad,  Tseguro, tipo, marca);
        this.agua=ti.DULCE;
        
    }

    public TipoAgua getAgua() {
        return agua;
    }

    public void setAgua(TipoAgua agua) {
        this.agua = agua;
    }

    @Override
    public void Nadar() {
        System.out.println("ESTOY NADANDO");
    }
    
}
