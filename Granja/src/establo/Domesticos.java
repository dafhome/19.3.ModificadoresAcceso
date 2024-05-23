package establo;

public class Domesticos extends Animales {

    private boolean tieneChip;
    private boolean esAdoptado;
    private final String type = "Domestico";
    public Domesticos(String raza, int edad, boolean tieneChip, boolean esAdoptado) {
        super(raza, edad);
        this.tieneChip = tieneChip;
        this.esAdoptado = esAdoptado;
        setTipo(type);
    }
    public boolean isTieneChip() {
        return tieneChip;
    }
    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }
    public boolean isEsAdoptado() {
        return esAdoptado;
    }
    public void setEsAdoptado(boolean esAdoptado) {
        this.esAdoptado = esAdoptado;
    }

    public String tieneChip(){
        String resultado;
        if (tieneChip) {
            resultado = "lleva chip";
        }
        else{
            resultado="no lleva chip";
        }
        return resultado;
    }

    public String esAdoptado(){
        String resultado;
        if (esAdoptado) {
            resultado = "es adoptado";
        }
        else{
            resultado="no es adoptado";
        }
        return resultado;
    }
    @Override
    public String toString() {
        return "Animal " + tipo + " de raza " + raza + ", " + esAdoptado()+ ", tiene "+ edad + " años y "+tieneChip();
    }

    

    
    
}
