import java.util.List;

// Paso S: GestorParqueadero conserva el cálculo y coordina el cierre del mes.
// Exportar y notificar se movieron a sus propias clases.
public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorSMS notificador = new NotificadorSMS();

    public double calcularCobro(Vehiculo v) {
        switch (v.getTipo()) {
            case "MENSUAL": return v.getValorMensualidad();
            case "MINUTOS": return v.getMinutos() * v.getTarifaMinuto();
            default: throw new IllegalArgumentException("Tipo desconocido: " + v.getTipo());
        }
    }

    public void cerrarMes(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            double cobro = calcularCobro(v);
            repositorio.insertar(v.getPlaca(), cobro);
            notificador.enviar(v, cobro);
            exportador.agregar(v, cobro);
        }
        System.out.println(exportador.generar());
    }
}
