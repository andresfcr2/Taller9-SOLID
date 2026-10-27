// Paso O: tipo nuevo agregado sin modificar ninguna clase existente.
// Tarifa plena por día; a partir del día 6 cada día tiene 20 % de descuento.
public class VehiculoPorDia extends Vehiculo {
    private double tarifaDia;
    private int dias;

    public VehiculoPorDia(String placa, String propietario, double tarifaDia, int dias) {
        super(placa, propietario);
        this.tarifaDia = tarifaDia;
        this.dias = dias;
    }

    @Override
    public double calcularCobro() {
        int diasPlenos = Math.min(dias, 5);
        int diasConDescuento = dias - diasPlenos;
        return diasPlenos * tarifaDia + diasConDescuento * tarifaDia * 0.8;
    }
}
