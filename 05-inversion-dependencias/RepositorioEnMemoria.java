import java.util.HashMap;
import java.util.Map;

// Paso D: implementación para probar sin base de datos. Guarda los cobros en un Map.
public class RepositorioEnMemoria implements RepositorioCobros {
    private Map<String, Double> cobros = new HashMap<>();

    @Override
    public void insertar(String placa, double cobro) {
        cobros.put(placa, cobro);
    }

    public double obtener(String placa) {
        return cobros.get(placa);
    }

    public int cantidad() {
        return cobros.size();
    }
}
