public class Onibus extends Veiculo {
  private int quantidadeEixos;

  public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, int quantidadeEixos) {
      super(marca, modelo, ano, capacidadePassageiros, "Diesel");
      this.quantidadeEixos = quantidadeEixos;
  }

  @Override
  public double calcularAutonomia() {
      return 200 * 5;
  }
}