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

        // ---- Paso L: descomente este bloque y ejecute ----
        // List<VehiculoMensualista> mensualistas = new ArrayList<>();
        // mensualistas.add(camila);
        // mensualistas.add(valentina);
        // int puntos = 0;
        // for (VehiculoMensualista m : mensualistas) {
        //     puntos += m.calcularPuntos();
        // }
        // System.out.println("Total puntos de fidelidad: " + puntos);
    }
}
