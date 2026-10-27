import java.util.List;

// Paso D: GestorParqueadero recibe el repositorio por el constructor.
// No sabe si detrás hay MySQL, un archivo o un Map en memoria.
public class GestorParqueadero {
    private RepositorioCobros repositorio;
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorSMS notificador = new NotificadorSMS();

    public GestorParqueadero(RepositorioCobros repositorio) {
        this.repositorio = repositorio;
    }

    public void cerrarMes(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            double cobro = v.calcularCobro();
            repositorio.insertar(v.getPlaca(), cobro);
            notificador.enviar(v, cobro);
            exportador.agregar(v, cobro);
        }
        System.out.println(exportador.generar());
    }
}
