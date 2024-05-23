package establo;

public class Salvajes extends Animales {
    
    private String habitat;
    private boolean estaLibertad;
    private final String type = "Salvaje";

    public Salvajes(String raza, int edad, String habitat, boolean estaLibertad) {
        super(raza, edad);
        this.habitat = habitat;
        this.estaLibertad = estaLibertad;
        setTipo(type);

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEstaLibertad() {
        return estaLibertad;
    }

    public void setEstaLibertad(boolean estaLibertad) {
        this.estaLibertad = estaLibertad;
    }

    public String getType() {
        return type;
    }

    public String estaLibertad(){
        String resultado;
        if (estaLibertad) {
            resultado = "vive en libertad";
        }
        else{
            resultado="vive en cautividad";
        }
        return resultado;
    }

    @Override
    public String toString() {
                return "Animal " + tipo + " de raza " + raza + ", " + estaLibertad()+ ", tiene "+ edad + " años y su habitat es "+habitat;

    }

    

    

}
