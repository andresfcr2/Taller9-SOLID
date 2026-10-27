public class VehiculoMensualista extends Vehiculo {
    protected double valorMensualidad;

    public VehiculoMensualista(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario);
        this.valorMensualidad = valorMensualidad;
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }

    // Puntos del programa de fidelidad: 1 punto por cada $10.000 de mensualidad.
    public int calcularPuntos() {
        return (int) (valorMensualidad / 10000);
    }
}
