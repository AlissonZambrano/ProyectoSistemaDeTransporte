package sistematransporte;
class Seguro {
    private String nombre;
    private double porcentaje;
    public Seguro(String nom, double por){
        this.nombre=nom;
        this.porcentaje=por;
    }

    public String getNombre() {
        return nombre;
    }


    public double getPorcentaje() {
        return porcentaje;
    }

    public void CobrarSeguros(UTransporte val){
        System.out.println("Tipo de seguro"+val.getTseguro().getNombre());
        System.out.println("Valor Total: "+(val.getValorUnidad()*val.getTseguro().getPorcentaje()));
        System.out.println("SEGUROS: "+val.getTseguro().getNombre()+" LE AGRADECE SU VISITA ");
    }

   
}
