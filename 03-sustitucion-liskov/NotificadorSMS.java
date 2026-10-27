// Paso S: el texto del mensaje es responsabilidad de Atención al Cliente.
public class NotificadorSMS {

    public void enviar(Vehiculo v, double cobro) {
        System.out.println("SMS a " + v.getPropietario() + " | Placa " + v.getPlaca()
            + ": su cobro de este mes es $" + String.format("%,.0f", cobro));
    }
}
