import java.util.List;

public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();

    public double calcularCobro(Vehiculo v) {
        switch (v.getTipo()) {
            case "MENSUAL": return v.getValorMensualidad();
            case "MINUTOS": return v.getMinutos() * v.getTarifaMinuto();
            default: throw new IllegalArgumentException("Tipo desconocido: " + v.getTipo());
        }
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }
}
