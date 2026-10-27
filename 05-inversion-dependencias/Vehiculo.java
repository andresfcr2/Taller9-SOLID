// Paso O: Vehiculo es abstracta. Cada subclase sabe calcular su propio cobro.
// Paso I: ya no implementa una interfaz "gorda", sino tres pequeñas.
public abstract class Vehiculo implements ConMinutos, ConSeguro, ConLavado {
    protected String placa;
    protected String propietario;
    protected int minutos;
    protected int lavados;

    public Vehiculo(String placa, String propietario) {
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getPlaca()       { return placa; }
    public String getPropietario() { return propietario; }

    public abstract double calcularCobro();

    public void registrarMinutos(int minutos)  { this.minutos += minutos; }
    public double calcularSeguro()             { return calcularCobro() * 0.02; }
    public void solicitarLavados(int cantidad) { this.lavados += cantidad; }
}
