package Entidades;
public class Internacional extends Envio{

    public Internacional(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 90 horas";
    }
    
}
