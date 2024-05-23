package invernadero;

public class Plantas {

    String especie;
    private boolean esVariegada;
    public int edad;
    private double precio;

    public Plantas(String especie, boolean esVariegada, int edad, double precio) {
        this.especie = especie;
        this.esVariegada = esVariegada;
        this.edad = edad;
        this.precio = precio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isEsVariegada() {
        return esVariegada;
    }

    public void setEsVariegada(boolean esVariegada) {
        this.esVariegada = esVariegada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        if (esVariegada) {
            return especie + ", variegada, tiene " + edad + " años y cuesta " + precio + "€";
        } else
            return especie + ", tiene " + edad + " años y cuesta " + precio + "€";
    }


    public static String accedoArbol (Arboles a){
        return a.especie + " tiene "+a.getEdad()+" años y "+a.altura+" cm";
    }
}
