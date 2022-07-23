public class Municipal extends Envio{

    public Municipal(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 12 horas";
    }
    
}
