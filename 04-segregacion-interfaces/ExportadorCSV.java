// Paso S: la exportación es responsabilidad de Contabilidad, por eso vive aparte.
public class ExportadorCSV {
    private StringBuilder contenido = new StringBuilder("placa;propietario;cobro\n");

    public void agregar(Vehiculo v, double cobro) {
        contenido.append(v.getPlaca()).append(";")
                 .append(v.getPropietario()).append(";")
                 .append(cobro).append("\n");
    }

    public String generar() {
        return contenido.toString();
    }
}
