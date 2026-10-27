// Paso I: Casillero implementa solo lo que le aplica.
// Ya no escribe métodos vacíos para seguro ni lavado.
public class Casillero implements ConMinutos {
    private String codigo;
    private String usuario;
    private double tarifaMinuto;
    private int minutos;

    public Casillero(String codigo, String usuario, double tarifaMinuto) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.tarifaMinuto = tarifaMinuto;
    }

    public String getUsuario() { return usuario; }

    @Override
    public void registrarMinutos(int minutos) { this.minutos += minutos; }

    public double valorAlquiler() { return minutos * tarifaMinuto; }
}
