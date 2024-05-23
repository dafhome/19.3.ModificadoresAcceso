package establo;

public class Animales {

    protected String tipo;
    protected String raza;
    protected int edad;
    public Animales(String tipo, String raza, int edad) {
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
    }

    
    public Animales(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Animales [tipo=" + tipo + ", raza=" + raza + ", edad=" + edad + "]";
    }

    
    
}
