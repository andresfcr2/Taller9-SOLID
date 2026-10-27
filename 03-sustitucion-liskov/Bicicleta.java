// Paso L: Bicicleta ya no extiende VehiculoMensualista.
// Sigue siendo un Vehiculo y se cobra igual, pero no promete puntos que no tiene.
public class Bicicleta extends Vehiculo {
    private double valorMensualidad;

    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario);
        this.valorMensualidad = valorMensualidad;
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }
}
