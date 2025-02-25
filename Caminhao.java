public class Caminhao extends Veiculo {
  private double capacidadeCarga;

  public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
      super(marca, modelo, ano, 2, "Diesel");
      this.capacidadeCarga = capacidadeCarga;
  }

  @Override
  public double calcularAutonomia() {
      double consumo = 6 - (capacidadeCarga * 0.01);
      if (capacidadeCarga > 25) {
          consumo = 6 * 0.75;
      }
      return 300 * consumo;
  }
}