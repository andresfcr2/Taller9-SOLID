// Paso D: GestorParqueadero depende de esta interfaz, no de una base de datos concreta.
public interface RepositorioCobros {
    void insertar(String placa, double cobro);
}
