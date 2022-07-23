package Entidades;
public abstract class Envio {

  private Integer precio;

  public Envio(Integer precio) {
    this.precio = precio;
  }

  public Integer getPrecio() {
    return this.precio;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }

  public abstract String tiempoDeEnvio();
}

