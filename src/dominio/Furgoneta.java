package dominio;

public class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(String marca, String modelo, double precioBase, double capacidadM3) {
        super(marca, modelo, precioBase);
        this.capacidadM3 = capacidadM3;
    }


    public double CalcularPrecioFinal() {
        return getPrecioBase() * 0.5 * Math.cbrt(capacidadM3);
    }

    public double getCapacidadM3() {
        return capacidadM3;
    }

    public void setCapacidadM3(double capacidadM3) {
        this.capacidadM3 = capacidadM3;
    }
     public String toString(){
        String s ="Marca: "+this.getMarca()+". Modelo: "+this.getModelo()+". Precio base: "+this.getPrecioBase()+". Capacidad: "+this.getCapacidadM3(); 
        return s;
    }


}