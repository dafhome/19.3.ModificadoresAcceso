package invernadero;

public class Arboles {
    

    String especie;
    public int altura;
    private int edad;

    
    public Arboles(String especie, int altura, int edad) {
        this.especie = especie;
        this.altura = altura;
        this.edad = edad;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return  especie + ", con " + altura + " cm de alto y " + edad + "años de edad.";
    }

    

}
