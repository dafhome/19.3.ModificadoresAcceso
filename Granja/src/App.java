import java.util.ArrayList;

import establo.*;
import invernadero.*;
import metodos.Metodos;
import zapateria.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Animales> animales = new ArrayList<>();
        // Crear objeto Planta
        Plantas p1 = new Plantas("Monstera", true, 100, 120.50);
        // Crear objeto arbol
        Arboles a1 = new Arboles("Melocotonero", 210, 10);
        // Crear objeto AnimalDomestico
        animales.add(new Domesticos("Bulldog Frances", 10, true, false));
        // Crear objeto AnimalSalvaje
        animales.add(new Salvajes("Leopardo", 110, "Selva", true));

        // Imprimir todos los objetos instanciados
        for (Animales animal : animales) {
            System.out.println(animal);
        }
        System.out.println(p1);
        System.out.println(a1);

        // Acceder a atributos protected *no se puede*
        System.out.println();
        System.out.println("Atributos protected");
        for (Animales animal : animales) {
            System.out.println(animal.getRaza());
        }

        // Acceder a atributos default
        System.out.println();
        System.out.println("Atributo default - Especie Clase Arboles");
        System.out.println(a1.getEspecie());

        // Acceder a atributos public
        System.out.println();
        System.out.println("Atributo public - Edad Clase Plantas");
        System.out.println(p1.edad);

        // Acceder a atributos private
        System.out.println();
        System.out.println("Atributo private - Habitat Clase AnimalesSalvajes");
        Salvajes salvaje = (Salvajes) animales.get(1);
        System.out.println(salvaje.getHabitat());

        // ¿Puedes acceder a un atributo de la clase Arbol desde la clase Planta?
        System.out.println("Accedo a los atributos del a1 desde una clase estatica en Plantas");
        System.out.println(Plantas.accedoArbol(a1));
        Metodos.imprimir(Plantas.accedoArbol(a1),1,1);

        //Hemos traido una clase dentro de zapateria (de otro proyecto)
        System.out.println();
        Casual c1 = new Casual("Nike", "Jordan", "Piel", 40, 150, "Blanco");
        System.out.println(c1);
    }
}
