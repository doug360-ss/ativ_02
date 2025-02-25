public class Main {
  public static void main(String[] args) {
      Carro carro = new Carro("Ford", "Mustang", 2022, 5, "Cupe");
      Caminhao caminhao = new Caminhao("Volvo", "aaa", 2021, 5);
      Onibus onibus = new Onibus("Mercedes", "aaa", 2020, 30, 6);
      CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Sedan", 75);
      CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "aaa", 2021, 10, -10);

      carro.exibirDetalhes();
      System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

      caminhao.exibirDetalhes();
      System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

      onibus.exibirDetalhes();
      System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

      carroEletrico.exibirDetalhes();
      System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

      caminhaoRefrigerado.exibirDetalhes();
      System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
  }
}