public class Coche extends Vehiculo {
    @Override
    void arrancar() {
        // Llama al método arrancar() de la clase Vehiculo
        super.arrancar();

        // Añade comportamientos adicionales específicos de Coche
        verificarCombustible();
        System.out.println("El coche está listo para conducir.");
    }

    void verificarCombustible() {
        System.out.println("Verificando el nivel de combustible");
    }
}
