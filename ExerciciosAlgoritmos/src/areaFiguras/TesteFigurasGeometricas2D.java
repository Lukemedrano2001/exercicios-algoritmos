package areaFiguras;

public class TesteFigurasGeometricas2D {
	public static void main(String[] args) {
		FiguraGeometrica2D quadrado1 = new Quadrado(5);
		FiguraGeometrica2D tringualo1 = new Triangulo(4, 5);
		FiguraGeometrica2D circulo1 = new Circulo(5);
		
		System.out.println(quadrado1.exibeConsole());
		System.out.println(tringualo1.exibeConsole());
		System.out.println(circulo1.exibeConsole());
	}
}