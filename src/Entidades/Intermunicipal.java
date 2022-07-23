package Entidades;
public class Intermunicipal extends Envio{

    public Intermunicipal(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 36 horas";
    }

}
