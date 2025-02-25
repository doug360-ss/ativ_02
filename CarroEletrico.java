public class CarroEletrico extends Carro {
  private double bateriaKWh;

  public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro, double bateriaKWh) {
      super(marca, modelo, ano, capacidadePassageiros, tipoCarro);
      this.bateriaKWh = bateriaKWh;
  }

  @Override
  public double calcularAutonomia() {
      return bateriaKWh * 5;
  }
}