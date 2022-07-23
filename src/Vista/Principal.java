public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
      new Municipal(5000),
      new Intermunicipal(15000),
      new Internacional(25000)
    };
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      System.out.println(coche.tiempoDeEnvio());
    }
  }
}
