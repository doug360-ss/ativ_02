public class Carro extends Veiculo {
  private String tipoCarro;

  public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro) {
      super(marca, modelo, ano, capacidadePassageiros, "Gasolina");
      this.tipoCarro = tipoCarro;
  }

  @Override
  public double calcularAutonomia() {
      return 50 * 12;
  }
}