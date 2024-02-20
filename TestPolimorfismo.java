
public class TestPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido(); // Imprime: Algún sonido
        miPerro.hacerSonido(); // Imprime: Guau
        miGato.hacerSonido(); // Imprime: Miau
    }
}
