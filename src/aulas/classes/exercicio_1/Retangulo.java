package aulas.classes.exercicio_1;

public class Retangulo {
  private float alturaRetangulo, larguraRetangulo;

  public void gravarAlturaLarguraRetangulo(float altura, float largura) {
    alturaRetangulo = altura;
    larguraRetangulo = largura;
  }

  public float calculaAreaRetangulo() {
    return alturaRetangulo * larguraRetangulo;
  }

  public float calculaPerimetroRetangulo() {
    return (2 * alturaRetangulo) + (2 * larguraRetangulo);
  }

  // Na classe Retangulo, implemente o método exibe(),
  // que deve retornar as informações do retângulo:
  // ➢ Altura: altura
  // ➢ Largura: largura
  // ➢ Área: área
  // ➢ Perímetro: perímetro.
  public void exibe(float altura, float largura, float area, float perimetro) {
    System.out.format("Altura:  %.2f\nLargura:  %.2f\nÀrea:  %.2f\nPerímetro:  %.2f", altura, largura, area, perimetro);
  }
}
