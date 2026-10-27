import java.util.List;

// Paso O: desaparece el switch. GestorParqueadero no pregunta el tipo de vehículo.
public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorSMS notificador = new NotificadorSMS();

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
