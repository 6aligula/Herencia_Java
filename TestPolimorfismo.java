class Animal {
    void hacerSonido() {
        System.out.println("Algún sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

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
