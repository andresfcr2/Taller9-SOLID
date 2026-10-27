// Ahora extiende VehiculoMensualista. Este es el síntoma que se corrige en el paso L.
public class Bicicleta extends VehiculoMensualista {

    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, valorMensualidad);
    }

    @Override
    public int calcularPuntos() {
        throw new UnsupportedOperationException(
            "Las bicicletas no acumulan puntos de fidelidad");
    }
}
