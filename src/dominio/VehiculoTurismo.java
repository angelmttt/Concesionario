package dominio;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        super(marca, modelo, precioBase);
        this.numeroPlazas = numeroPlazas;
    }

    public double CalcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return getPrecioBase(); 
        } else {
            int plazasno5 = numeroPlazas - 5;
            double precioFinal = getPrecioBase() + (getPrecioBase() *0.10);
            return precioFinal;
        }
    }



    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
public String toString(){
        String s = "Marca: "+this.getMarca()+". Modelo: "+this.getModelo()+". Precio : "+this.getPrecioBase()+". Plazas: "+this.getNumeroPlazas();
        return s;
    }
    
}
