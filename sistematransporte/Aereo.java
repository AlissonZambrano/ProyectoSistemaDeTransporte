package sistematransporte;
public class Aereo extends UTransporte implements AccionA {
    private int NumMotores;
    private String PermisoVuelo;
    public Aereo(String placa, int NumPasajero, double Cilindro, double ValorUnidad, Seguro Tseguro, TipoMotor tipo, Marca marca, int motores, String vuelo){
        
        super(placa, NumPasajero, Cilindro, ValorUnidad,  Tseguro, tipo, marca);
        this.NumMotores=motores;
        this.PermisoVuelo=vuelo;
    }

    public int getNumMotores() {
        return NumMotores;
    }

    public String getPermisoVuelo() {
        return PermisoVuelo;
    }

    public void setNumMotores(int NumMotores) {
        this.NumMotores = NumMotores;
    }

    public void setPermisoVuelo(String PermisoVuelo) {
        this.PermisoVuelo = PermisoVuelo;
    }
    
    @Override
    public void Volar() {
        System.out.println("ESTOY VOLANDO");
    }
    
}
