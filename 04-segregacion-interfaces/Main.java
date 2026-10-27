import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehiculoMensualista camila = new VehiculoMensualista("KLM321", "Camila Rojas", 180000);
        VehiculoPorMinutos andres  = new VehiculoPorMinutos("XYZ45F", "Andrés Mora", 80, 1500);
        Bicicleta valentina        = new Bicicleta("BIC-07", "Valentina Díaz", 40000);
        VehiculoPorDia felipe      = new VehiculoPorDia("JKL789", "Felipe Ortiz", 25000, 8);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(camila);
        vehiculos.add(andres);
        vehiculos.add(valentina);
        vehiculos.add(felipe);

        GestorParqueadero gestor = new GestorParqueadero();
        gestor.cerrarMes(vehiculos);

        List<Fidelizable> conPuntos = new ArrayList<>();
        conPuntos.add(camila);
        // conPuntos.add(valentina);   // no compila: Bicicleta no es Fidelizable

        int puntos = 0;
        for (Fidelizable f : conPuntos) {
            puntos += f.calcularPuntos();
        }
        System.out.println("Total puntos de fidelidad: " + puntos);

        // Paso I: Casillero y VehiculoPorMinutos no tienen parentesco,
        // pero los dos se pueden tratar como ConMinutos.
        Casillero laura = new Casillero("C-12", "Laura Gómez", 20);
        List<ConMinutos> registranMinutos = new ArrayList<>();
        registranMinutos.add(laura);
        registranMinutos.add(andres);
        for (ConMinutos c : registranMinutos) {
            c.registrarMinutos(300);
        }
        System.out.println("Alquiler del casillero de " + laura.getUsuario() + ": $" + laura.valorAlquiler());
    }
}
